package oops;
import java.util.*;
public class Oops_question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      String names[]=new String[n];
      Optional<String> optional= Optional.ofNullable(names[0]);
      
      int length=optional.map(String::length).orElse(0);
      System.out.println(length);
      
      
	}

}
