package Day13.Main;
public class Reverse {
    public Reverse(){
    }
    public String reverse(String str){
        char a[]=str.toCharArray();
        String s="";
        for(int i=a.length-1;i>=0;i--){
            s+=a[i];
        }
        return s;
    }
    public static void main(String [] args){
        Reverse r=new Reverse();System.out.println(r.reverse("Apple"));
        System.out.println(r.reverse("{}(.;'/,)=-"));
        System.out.println(r.reverse("234rfd"));
        System.out.println(r.reverse(" "));
        System.out.println(r.reverse("k"));
    }
}

