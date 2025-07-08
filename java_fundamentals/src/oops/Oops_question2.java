package oops;

import java.util.*;

 class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public static double powerDouble(double num1, double num2) {
		return  Math.pow(num1, num2);
	}

	public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	
    	int a=in.nextInt();
    	int b=in.nextInt();
    	int result=Calculator.powerInt(a, b);
    	System.out.println(a + " to the power "+b+" is "+result);
    	
    	double c=in.nextDouble();
    	double d=in.nextDouble();
    	double res=Calculator.powerDouble(c,d);
    	System.out.println(c+ " to the power "+d+"is "+res);
    

    

}

}