package collectiion;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
}

// Program to filter employees by salary using Predicate
public class Collection31 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 8000));
        employees.add(new Employee(2, "Jane", 12000));
        employees.add(new Employee(3, "Alice", 9500));
        employees.add(new Employee(4, "Bob", 15000));
        employees.add(new Employee(5, "Carol", 9000));
        
        // Filter employees with salary < 10000
        Predicate<Employee> lowSalary = e -> e.getSalary() < 10000;
        ArrayList<String> names = employees.stream()
            .filter(lowSalary)
            .map(Employee::getName)
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Employees with salary < 10000: " + names);
    }
}
