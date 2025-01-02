package TestPackage;
import MainPackage.Person;
public class TestAccess {
	public static void main(String[] args) {
		Person p=new Person("Keerthu",21,"ABC Salem",67000);
		System.out.println("Name: "+p.name);
		System.out.println("Salary: "+p.Salary());

	}

}
