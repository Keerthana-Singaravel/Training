package Day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String [] args){
       try{
           Class c=Class.forName("Day7.Person");
           Constructor con[]=c.getDeclaredConstructors();
           for (int i=0;i<con.length;i++){
               System.out.println(con[i]);
           }
           Person p=(Person)con[1].newInstance("keerthu",21,45000);
           System.out.println(p);

           Field f[]=c.getDeclaredFields();
           for (int i=0;i<f.length;i++){
               System.out.println(f[i]);
           }

           Method m[]=c.getDeclaredMethods();
           for(int i=0;i<m.length;i++){
               //System.out.println(m[i]);

               if(m[i].getName().indexOf("getAge")!= -1){
                   m[i].invoke(p);
               }
           }
       }catch(Exception e){
            System.out.println("error occured...");
       }
    }
}
