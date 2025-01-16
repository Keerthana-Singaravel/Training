package Day12.ExternalSerializable;

import java.io.*;

class Student implements Externalizable {
    public String name;
    public int age;

    public Student(){
        System.out.println("no-arguments constructor is called..");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void writeExternal(ObjectOutput o)throws IOException{
        o.writeUTF(name);
        o.writeInt(age);
    }
    public void readExternal(ObjectInput i)throws IOException{
        name=i.readUTF();
        age=i.readInt();
    }
}

public class ExternalizableObj {
    public static void main(String [] args){
        try{
            Student s=new Student("Keerthu",21);
            FileOutputStream fo=new FileOutputStream("s_exe.ser");
            ObjectOutputStream o=new ObjectOutputStream(fo);
            o.writeObject(s);
            o.close();
            fo.close();
            System.out.println("Object has been deserialized: " + s);
        }catch(IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("s_ext.ser");
            ObjectInputStream i = new ObjectInputStream(fi);
            Student s = (Student) i.readObject();
            i.close();
            fi.close();
            System.out.println("Object has been deserialized: " + s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
