package oops;

import java.util.Scanner;

class Box{
	double width;
	double height;
	double depth;
	
	public Box(double w, double h, double d) {
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	
	public double calculateVolume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Width, Height, Depth");
		double w=in.nextDouble();
		double h=in.nextDouble();
		double d=in.nextDouble();		
		
		Box myBox =new Box(w,h,d);
		
		myBox.calculateVolume();
		
		System.out.println("The volume is "+myBox.calculateVolume());
		
		
	}
}