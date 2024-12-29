class Animal {
    public void speak(){
        System.out.println("Animal class is called...");
    }
}
    class Dog extends Animal{
        public void speak(){
            System.out.println("Dog class is barking....");
        }
    }
    class Cat extends Animal{
        public void speak(){
            System.out.println("Cat class is meowing...");
        }
    }
public class AnimalClass{
    public static void main(String [] args){
        Animal a=new Animal();
        Cat c=new Cat();
        Dog d=new Dog();
        a.speak();
        d.speak();
        c.speak();
    }
}
