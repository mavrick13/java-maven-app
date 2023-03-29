pipeline {
    agent {
        docker { image 'node:16-alpine'}
    }
    stages {
        stage9'Test' {
            steps {
                sh 'node --version'
            }
        }
    }
}