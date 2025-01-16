package Day12.SerializeDeserialize;

import java.io.*;

class Student implements Serializable{
    public String name;
    public int age;
    public double mark;

    public Student(String name,int age,double mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }
}
public class Serialize {
    public static void main(String [] args){
       try{
           Student s=new Student("Keerthana",21,8.54);
           FileOutputStream fo=new FileOutputStream("s.ser");
           ObjectOutputStream o=new ObjectOutputStream(fo);
           o.writeObject(s);
           o.close();
           fo.close();
           System.out.println("Object Serialized....");
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
