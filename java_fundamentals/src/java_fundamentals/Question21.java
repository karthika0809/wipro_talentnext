package java_fundamentals;
import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int[] arr=new int[n];
         int sum=0;
         double average=0;
         for(int i=0; i<arr.length; i++) {
        	 arr[i]=in.nextInt();
        	 sum +=arr[i];
        	 average = (double)sum/arr[i];
         }
         System.out.println(sum);
         System.out.println(average);
         
         
	}

}
