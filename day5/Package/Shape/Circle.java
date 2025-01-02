package Shape;

public class Circle {
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double GetCalculate(){
        double area=3.14*radius*radius;
        return area;
    }
}
