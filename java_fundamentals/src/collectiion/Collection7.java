package collectiion;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Employee class
class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;
    
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
    
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Email: " + email + 
               ", Gender: " + gender + ", Salary: " + salary;
    }
}

// Main class to test Vector with Iterator and Enumeration
public class Collection7 {
    public static void main(String[] args) {
        Vector<Employee> vector = new Vector<>();
        
        // Add employees
        vector.add(new Employee(1, "John", "john@example.com", "Male", 50000));
        vector.add(new Employee(2, "Jane", "jane@example.com", "Female", 60000));
        
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}