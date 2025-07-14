package wrapperclasses;
import java.util.*;
public class Wrapperquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
     int a=in.nextInt(); 
     System.out.println("java Test "+a);
     
     System.out.println("Given Number :"+a);
     String binary=Integer.toBinaryString(a);
     System.out.println("Binary equivalent :"+binary);
     String octal=Integer.toOctalString(a);
     System.out.println("Octal equivalent :"+octal);
     String hex=Integer.toHexString(a);
     System.out.println("Hexadecimal equivalent :"+hex); 
     
     
     
	}

}
