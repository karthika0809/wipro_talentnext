package java_fundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		if(a=='F') {
			int n=in.nextInt();
			if(n>=1&&n<=58) {
				System.out.println("8.2%");
			}else {
				System.out.println("9.2");
			}
		}else {
			int m=in.nextInt();
			if(m>=1&&m<=58) {
				System.out.println("8.4%");
			}else {
				System.out.println("9.4%");
			}
		}

	}

}
