abstract class shapes{
    abstract void calculateArea();
}
class circle extends shapes{
    public void calculateArea(){
        int r=5;
        System.out.println("Area of Circle : "+r*r);
    }
}
class rectangle extends shapes{
    public void calculateArea(){
        int l=6,b=9;
        System.out.println("Area of rectangle: "+l*b);
    }
}
public class shape {
    public static void main(String [] args){
        circle c=new circle();
        c.calculateArea();
        rectangle r=new rectangle();
        r.calculateArea();
    }
}
