package MainPackage;

public class Employee {
public Employee(String name, int age, String address, double salary) {
		super(name, age, address, salary);
	}
    public void Display() {
    	System.out.println("Name "+name);
    	System.out.println("Age :"+age);
    	System.out.println("Address:"+address);
    	System.out.println("Salary :"+Salary());
    }
}
