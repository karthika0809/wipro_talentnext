package java_fundamentals;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		 char a=in.next().charAt(0);
		 char b=in.next().charAt(0);
		 if(a<b) {
			 System.out.println(a+","+b);
		 }else {
			 System.out.println(b+","+a);
		 }
	}

}
