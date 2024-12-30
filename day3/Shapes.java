import java.util.Random;
import java.util.Scanner;
class Shape{
    public void area(){
        System.out.println("Area of shapes ");
    }
}
class Rectangle extends Shape{
    public int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        int area=l*b;
        System.out.println("Area of Rectangle : "+area);
    }
}
class Square extends Rectangle{
    public int r;
    public Square(int r){
        super(r,r);
    }
    public void area(){
        int area=l*l;
        System.out.println("Area of Square = "+area);
    }
}
public class Shapes {
    public static void main(String [] args){
        Shape sh=new Shape();
        Square s=new Square(5);
        Rectangle r=new Rectangle(4,5);
        s.area();
        r.area();
    }
}
