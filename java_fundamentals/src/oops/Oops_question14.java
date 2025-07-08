package oops;
import java.util.*;
public class Oops_question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     String a=in.nextLine();
     String b=in.nextLine();
     if(a.length()<=b.length()) {
    	 System.out.println(a+b+a);
     }else if(a.length()==0 && b.length()==0) {
    	 System.out.println("Give String");
     }
     
	}

}
