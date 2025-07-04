package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       char ch=in.next().charAt(0);
       if(Character.isDigit(ch)) {
    	   System.out.println("Digit");
       }else if(Character.isAlphabetic(ch)) {
    	   System.out.println("Alphabet");
       }else {
    	   System.out.println("Special Symbols");
       }
	}

}
