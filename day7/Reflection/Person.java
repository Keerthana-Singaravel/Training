package Day7;

public class Person {
    public String name;
    public int age;
    public int sal;
    public Person(){

    }
    public Person(String name,int age,int sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        System.out.println("sal method invoked..");
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getSal(){
        return sal;
    }
    public void setSal(int sal){
        this.sal=sal;
    }

}
