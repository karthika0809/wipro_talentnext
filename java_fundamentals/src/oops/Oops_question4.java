package oops;
import java.util.*;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("Flying");
	}
}

public class Oops_question4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
		
	}
}