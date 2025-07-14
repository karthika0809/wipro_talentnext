package wrapperclasses;
import java.util.*;

class Employee implements Cloneable{
	String name;
	int id;
	String email;
	
	public Employee(String name,int id,String email) {
		this.name=name;
		this.id=id;
		this.email=email;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	

public void display(){
    System.out.println("Name:"+name +"id:"+id+"Email:"+email);
    
	
}



public class Wrapperquestion4 {
   
	
		public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter name:");
		    String name = in.nextLine();

		    System.out.println("Enter id:");
		    int id = in.nextInt();
		    in.nextLine(); // Consume newline

		    System.out.println("Enter email:");
		    String email = in.nextLine();

		    Employee emp1 = new Employee(name, id, email);
		    System.out.println("Original Employee:");
		    emp1.display();

		    try {
		        Employee emp2 = (Employee) emp1.clone();
		        System.out.println("Cloned Employee:");
		        emp2.display();

		        // Modify original
		        emp1.name = "Modified Name";
		        emp1.email = "modified@example.com";

		        System.out.println("\nAfter modifying original:");
		        System.out.println("Original Employee:");
		        emp1.display();
		        System.out.println("Cloned Employee:");
		        emp2.display();

		    } catch (CloneNotSupportedException e) {
		        e.printStackTrace();
		    }

		    in.close();
	


			
		}

	}

}
