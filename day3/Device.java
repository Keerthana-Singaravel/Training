interface Printer{
    void print();
}
interface Scanner{
    void scan();
}
class AllInOne implements Printer,Scanner{
    public void print(){
        System.out.println("Printer method is called....");
    }
    public void scan(){
        System.out.println("Scanner method is called...");
    }
}
public class Device {
    public static void main(String [] args){
    AllInOne a=new AllInOne();
    a.print();
    a.scan();
    }
}
