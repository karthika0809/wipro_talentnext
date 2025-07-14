package wrapperclasses;
import java.util.*;
public class Wrapperquestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		 // Validate input range
        if (num< 1 || num > 255) {
            System.out.println("Invalid input. Please enter a number between 1 and 255.");
            return;
        }

		String binary=String.format("%9s", Integer.toBinaryString(num)).replace(' ', '0');
		System.out.printf(binary);
		
	}

}
