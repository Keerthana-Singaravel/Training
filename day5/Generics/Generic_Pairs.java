package Day5;
class pair<k,v>{
    public k key;
    public v value;

    public pair(k key,v value){
        this.key=key;
        this.value=value;
    }
    public k Key(){
        return key;
    }
    public v Value() {
        return value;
    }
    public void display(){
        System.out.println("Key : "+key);
        System.out.println("Value "+value);
    }
}
public class Generic_Pairs {
    public static void main(String [] args){
        pair<String, String> p1=new pair<>("Age","Keerthi");
        p1.display();
        pair<String, Integer> p2=new pair<>("Age",21);
        p2.display();
        pair<Integer,String> p3=new pair<>(84 ,"Pass");
        p3.display();
        pair<Double, String> p4=new pair<>(8.45,"Grade A1");
        p4.display();
    }
}
