package collectiion;

import java.util.LinkedList;

//Employee class
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
 
 public void GetEmployeeDetails() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Name: " + empName);
     System.out.println("Email: " + email);
     System.out.println("Gender: " + gender);
     System.out.println("Salary: " + salary);
 }
 
 public int getEmpId() {
     return empId;
 }
 
 public float getSalary() {
     return salary;
 }
}

//EmployeeDB class using LinkedList
class EmployeeDB {
 private LinkedList<Employee> list = new LinkedList<>();
 
 public boolean addEmployee(Employee e) {
     return list.add(e);
 }
 
 public boolean deleteEmployee(int empId) {
     for (Employee emp : list) {
         if (emp.getEmpId() == empId) {
             return list.remove(emp);
         }
     }
     return false;
 }
 
 public String showPaySlip(int empId) {
     for (Employee emp : list) {
         if (emp.getEmpId() == empId) {
             return "PaySlip for Employee ID " + empId + ": Salary = " + emp.getSalary();
         }
     }
     return "Employee not found";
 }
}

//Main class to test Employee and EmployeeDB
public class Collection5 {
 public static void main(String[] args) {
     EmployeeDB db = new EmployeeDB();
     
     // Add employees
     Employee e1 = new Employee(1, "John", "john@example.com", "Male", 50000);
     Employee e2 = new Employee(2, "Jane", "jane@example.com", "Female", 60000);
     db.addEmployee(e1);
     db.addEmployee(e2);
     
     // Test GetEmployeeDetails
     System.out.println("Employee Details:");
     e1.GetEmployeeDetails();
     
     // Test showPaySlip
     System.out.println("\nPaySlip:");
     System.out.println(db.showPaySlip(1));
     
     // Test deleteEmployee
     System.out.println("\nDeleting Employee ID 1: " + (db.deleteEmployee(1) ? "Success" : "Failed"));
     System.out.println("PaySlip after deletion: " + db.showPaySlip(1));
 }
}