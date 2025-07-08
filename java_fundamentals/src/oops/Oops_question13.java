package oops;
import java.util.*;
public class Oops_question13 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder result=new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        
        if (str.charAt(i) == '*') continue;
        if (i > 0 && str.charAt(i - 1) == '*') continue;
        if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;

        result.append(str.charAt(i));
    }

    System.out.println(result.toString());
    }
	}


