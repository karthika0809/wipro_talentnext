package java_fundamentals;
import java.util.*;
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       if(a%10==b%10) {
    	   System.out.println("lastdigit("+a+","+b+")"+"-->True");
       }else {
    	   System.out.println("lastdigit("+a+","+b+")"+"-->False");
       }
       
	}

}
