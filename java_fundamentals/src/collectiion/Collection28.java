package collectiion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;
    
    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
    
    public String getLocation() {
        return location;
    }
}

// Program to extract employee locations using Function
public class Collection28 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Pune", 50000));
        employees.add(new Employee(2, "Jane", "Mumbai", 60000));
        employees.add(new Employee(3, "Alice", "Pune", 55000));
        employees.add(new Employee(4, "Bob", "Delhi", 65000));
        employees.add(new Employee(5, "Carol", "Pune", 52000));
        
        // Extract locations using Function
        Function<Employee, String> getLocation = Employee::getLocation;
        ArrayList<String> locations = employees.stream()
            .map(getLocation)
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Employee Locations: " + locations);
    }
}
