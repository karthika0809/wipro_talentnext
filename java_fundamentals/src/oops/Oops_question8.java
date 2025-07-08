package oops;
import java.util.*;
public class Oops_question8 {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Give a String :");
	String s=in.nextLine();
	String rev=new StringBuilder(s).reverse().toString();
	if(s.equals(rev)) {
		System.out.println(s+" is Palindrome");
	}else {
		System.out.print(s+ " is not Palindrome");
	}

}
}