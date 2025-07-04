package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    char ch=in.next().charAt(0);
     if(Character.isLowerCase(ch)) {
    	 System.out.println(ch+"->"+Character.toUpperCase(ch));
     }else {
    	 System.out.println(ch+"->"+Character.toLowerCase(ch));
     }
	}

}
