package keerthana;
import Shape.Circle;
import Shape.Rectangle;
public class Mains {
    public static void main(String [] args) {
    	Circle c=new Circle(5);
    	System.out.println("Area of Circle : "+c.GetCalculate());
    	Rectangle r=new Rectangle(4,5);
    	System.out.println("Area of Rectangle : "+r.GetCalculate());
    }
}
