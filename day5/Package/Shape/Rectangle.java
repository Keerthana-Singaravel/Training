package Shape;

public class Rectangle {
    public int length,breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int GetCalculate(){
        int area=length*breadth;
        return area;
    }
}