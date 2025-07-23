package collectiion;

import java.util.ArrayList;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;
    
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String toString() {
        return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
    }
}

// Program to filter employees by location using Stream API
public class Collection26 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 30, "Pune"));
        employees.add(new Employee(2, "Jane", 25, "Mumbai"));
        employees.add(new Employee(3, "Alice", 28, "Pune"));
        employees.add(new Employee(4, "Bob", 35, "Delhi"));
        employees.add(new Employee(5, "Carol", 27, "Pune"));
        
        // Filter employees in Pune
        ArrayList<Employee> puneEmployees = employees.stream()
            .filter(e -> e.getLocation().equals("Pune"))
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Employees in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}
