package Day9;
import java.util.Scanner;
import java.util.HashMap;
public class Contact {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       HashMap<String,String> h=new HashMap<String,String>();
       h.put("John","9876543210");
       h.put("Alice","9123456780");
       h.put("Bob","8899776655");
        for(String con:h.keySet()){
            System.out.println(con+"->"+h.get(con));
        }

       System.out.println("enter the key to search:");
       String name=sc.nextLine();
       if(h.containsKey(name)){
           System.out.println("Contact of "+name+" : "+h.get(name));
       }
       else {
           System.out.println("Contact not found ");
       }

       System.out.println("enter the name to remove:");
       String r=sc.nextLine();
       if(h.containsKey(r)){
           h.remove(r);
       }

       for(String con:h.keySet()){
           System.out.println(con+"->"+h.get(con));
       }
    }

}
