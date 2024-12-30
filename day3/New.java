interface Constants{
    double PI=3.14;
}
class circles implements Constants{
    private double r;
    public circles(double r){
        this.r=r;
    }
    public void calculateArea(){
        System.out.println("Arae of circle = "+PI*r*r);
    }
}
public class New {
    public static void main(String [] args){
        circles c=new circles(6.0);
        c.calculateArea();
    }
}
