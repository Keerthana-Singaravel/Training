package Day12.SerializeDeserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String [] args){
        try{
            FileInputStream fi=new FileInputStream("s.ser");
            ObjectInputStream i=new ObjectInputStream(fi);
            Student s=(Student) i.readObject();
            i.close();
            fi.close();
            System.out.println("object deserialized...");
            System.out.println("Name : "+s.name);
            System.out.println("Age : "+s.age);
            System.out.println("Marks : "+s.mark);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
