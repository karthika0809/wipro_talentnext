package java_fundamentals;
import java.util.*;
public class Question4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}else if(num==0) {
			System.out.println("Zero");
		}else {
			System.out.println("Negative");
		}

	}

}
