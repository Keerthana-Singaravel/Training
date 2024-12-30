class Employe{
    public void calculateSalary(){
        System.out.println("Salary for each Designations : ");
    }
}
class Manager extends Employe{
    public void  calculateSalary(){
        int salary=65000;
        System.out.println("Manager's salary : "+salary);
    }
}
class Developer extends Employe{
    public void  calculateSalary(){
        int salary=45000;
        System.out.println("Developer's salary : "+salary);
    }
}
public class Employees {
    public static void main(String [] args){
    Employe e=new Employe();
    e.calculateSalary();
    Manager m=new Manager();
    m.calculateSalary();
    Developer d=new Developer();
    d.calculateSalary();
    }
}
