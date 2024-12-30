import java.util.Scanner;
class Vehicle{
    public void start(){
        System.out.println("Vehicle class Method Called...");
    }
}
class Cars extends Vehicle{
    public void start(){
        System.out.println("Car class Method Called...");
    }
}
public class Vehicles {
    public static void main(String [] args){
        Cars c=new Cars();
        Vehicle v=new Vehicle();
        c.start();
        v.start();
    }
}
