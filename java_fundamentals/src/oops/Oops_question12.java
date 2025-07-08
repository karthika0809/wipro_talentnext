package oops;
import java.util.*;
public class Oops_question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    System.out.println("Enter String :");
    String str=in.nextLine();
    //System.out.println("Enter length :");
    //int n=in.nextInt();
    String new_string=str.substring(1, (str.length())-1);
    System.out.println(new_string);
    
	}

}
