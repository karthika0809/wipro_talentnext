package oops;
import java.util.*;
public class Oops_question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		
		if(str.length()%2==0) {
			System.out.print(str.substring(0,(str.length())/2)); 
			
			
			
		}else {
			System.out.println("null");
		}
	}

}
