public class Mainconcept {
    public static void main(String[] args) {
        person p1=new person();
        p1.name ="aadi";
        p1.age  =22;
        System.out.println(p1.age+""+p1.name);
        p1.walk();
        p1.talk();
        
    }

}
class person{

    String name;
    int age;
    
    void walk() {
        System.out.println(name + " is walking");

    }
    void talk(){

        System.out.println(age + " is talking");
    }



}