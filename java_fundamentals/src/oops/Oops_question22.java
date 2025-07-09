package oops;
import java.util.Optional;


public class Oops_question22 {
    public static void main(String[] args) {
        Employee emp = null; // You can try: new Employee("John")

        try {
            // Use Optional to check and throw if null
            Employee validEmp = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee: Employee object is null"));

            System.out.println("Employee name: " + validEmp.getName());
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Custom exception
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
