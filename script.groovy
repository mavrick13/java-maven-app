def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image "
    withCredentials([usernamePassword(credentialsId: 'docker-pass', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh 'start mvn package'
        sh 'start docker build -t mavrick13/jenkins-images:jma-2.0 .'
        sh "echo $PASS | start /B docker login -u $USER --password-stdin"
        sh 'start /B docker push mavrick13/jenkins-images:jma-2.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
