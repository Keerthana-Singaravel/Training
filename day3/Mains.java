interface animal{
    void eat();
    void sleep();
}
class dog implements animal{
    public void eat(){
        System.out.println("Dog is eating food...");
    }
    public void sleep(){
        System.out.println("Dog is sleeping...");
    }
}
class cat implements animal{
    public void eat(){
        System.out.println("Cat is eating...");
    }
    public void sleep(){
        System.out.println("Cat is Sleeping...");
    }
}
public class Mains {
    public static void main(String [] args){
    animal d=new dog();
    d.eat();
    d.sleep();
    animal c=new cat();
    c.eat();
    c.sleep();
    }
}
