package collectiion;

import java.util.ArrayList;

//Student class
class Student {
 private int rollNo;
 private String name;
 private int mark;
 
 public Student(int rollNo, String name, int mark) {
     this.rollNo = rollNo;
     this.name = name;
     this.mark = mark;
 }
 
 public int getMark() {
     return mark;
 }
}

//Program to count students passing test using Stream API
public class Collection27 {
 public static void main(String[] args) {
     ArrayList<Student> students = new ArrayList<>();
     students.add(new Student(1, "John", 60));
     students.add(new Student(2, "Jane", 45));
     students.add(new Student(3, "Alice", 75));
     students.add(new Student(4, "Bob", 30));
     students.add(new Student(5, "Carol", 80));
     
     // Count students with marks >= 50
     long passCount = students.stream()
         .filter(s -> s.getMark() >= 50)
         .count();
     
     System.out.println("Number of students who passed (marks >= 50): " + passCount);
 }
}
