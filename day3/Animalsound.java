class Animals{
    public void sound(){
        System.out.println("Animal Sounds like...");
    }
}
class Dogs extends Animal{
    public void sound(){
        System.out.println("bark...!");
    }
}
class Cats extends Animal{
    public void sound(){
        System.out.println("Meow...!");
    }
}
public class Animalsound {
    public static void main(String [] args){
        Dogs d=new Dogs();
        Cats c=new Cats();
        d.sound();
        c.sound();
    }
}
