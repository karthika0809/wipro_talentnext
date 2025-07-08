package oops;

import java.util.*;

public class Oops_question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String :");

		String s = in.nextLine();
		System.out.println("Enter Length of the String :");
		int n = in.nextInt();
		int r=in.nextInt();
		 if(s.length()>2) {
			 System.out.println(s.substring(0, n).repeat(r));
			 
			
		}else {
			return;
		}

	}
	

}
