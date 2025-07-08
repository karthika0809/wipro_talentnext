package oops;
import java.util.*;
public class Oops_question15 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		
		if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x'){
			System.out.println(str.substring(1,str.length()-1));
		}else {
			System.out.println(str);
		}
			

	}

}
