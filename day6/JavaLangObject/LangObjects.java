package Day6;
public class LangObjects {
    public String a,b;
    public LangObjects(String a,String b){
        this.a=a;
        this.b=b;
    }

    public String toString(){
        return "LangObj{obj1 = "+a+" , obj2 = "+b+"}";
    }
    public static void main(String[] args) {
    LangObjects lo=new LangObjects("apple","banana");

    System.out.println("Class of the Object is"+lo.getClass());
    System.out.println("ToString method : " + lo.toString());
    }

}
