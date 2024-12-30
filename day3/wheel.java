interface vehicle{
    void start();
}
interface FourWheeler extends vehicle{
     void starting();
}
interface TwoWheeler extends vehicle{
    void kick();
}
class car implements FourWheeler{
    public void start(){
        System.out.println("car is starting with key... ");
    }
    public void starting(){
        System.out.println("Four wheeler is called....");
    }
}
class bike implements TwoWheeler{
    public void start(){
        System.out.println("bike is starting with key... ");
    }
    public void kick(){
        System.out.println("Two wheeler is called....");
    }
}
public class wheel {
    public static void main(String [] args){
        FourWheeler f=new car();
        f.start();
        f.starting();
        TwoWheeler b=new bike();
        b.start();
        b.kick();
    }
}
