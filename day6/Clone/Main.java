package Day6;

class Name implements Cloneable{
    public String name,DOB;
    public Name(String name,String DOB){
        this.name=name;
        this.DOB=DOB;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Main {
    public static void main(String [] args){
    try{
        Name n=new Name("Keerthu","2.11.2003");
        System.out.println("Original class: "+n.name+" "+n.DOB);
        Name z=(Name)n.clone();
        System.out.println("Cloned class: "+z.name+" "+z.DOB);
        }
    catch(CloneNotSupportedException e){
        System.out.println("Clone not performed");
    }
    }
}
