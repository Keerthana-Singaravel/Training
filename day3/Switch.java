abstract class Appliance{
    abstract void turnOn();
    public void turnOff(){
        System.out.println("Turn off method is called..");
    }
}
class Fan extends Appliance{
    public void turnOn(){
        System.out.println("Turn on method is called...");
    }
}
public class Switch {
    public static void main(String [] args){
        Appliance a=new Fan();
        a.turnOff();
        a.turnOn();
    }
}
