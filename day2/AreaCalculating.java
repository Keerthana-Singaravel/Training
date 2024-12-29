import java.util.Scanner;
public class AreaCalculating {
    public void Calculation(int l,int b){
        int area=l*b;
        System.out.println("Area of Rectangle = "+area);
    }

    public void Calculation(int r){
        int area=r*r;
        System.out.println("Area of Circle = "+area);
    }

    public void Calculation(double b,double h){
        double area=0.5*h*b;
        System.out.println("Area of Triangle = "+area);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        AreaCalculating ac=new AreaCalculating();

        System.out.println("enter the length and breadth for calculating area of rectangle:");
        int length=sc.nextInt(),breadth=sc.nextInt();
        ac.Calculation(length,breadth);

        System.out.println("enter the radius for calculating area of circle:");
        int radius=sc.nextInt();
        ac.Calculation(radius);

        System.out.println("enter the base and height for calculating area of Triangle:");
        double base=sc.nextDouble(),height=sc.nextDouble();
        ac.Calculation(base,height);
    }
}
