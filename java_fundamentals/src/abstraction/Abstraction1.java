package abstraction;
import java.util.*;
abstract class Compartment{
	public abstract String notice();
	
}
 class FirstClass extends Compartment{
	public  String notice() {
		return "Notice: This is First Class";
	}
	
}
 class Ladies extends Compartment{
	public String notice() {
	return "Notice: This is Ladies Compartment";
    }
}
 class General extends Compartment{
	public String notice() {
		return "Notice: This is General Compartment";
	}
}
 class Luggage extends Compartment{
	public String notice() {
		return "Notice : This is Luggage Compartment";
	}
}




public class Abstraction1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=in.nextInt();
		Compartment[] compartments=new Compartment[n];
		Random rand=new Random();
		for(int i=0;i<compartments.length;i++) {
			int type=rand.nextInt(n)+1;
			
			switch(type) {
			case 1:
				compartments[i]=new FirstClass();
				break;
			case 2:
				compartments[i]=new Ladies();
				break;
			case 3:
				compartments[i]=new General();
				break;
			case 4:
				compartments[i]=new Luggage();
				break;
			}
		}
		for(int i=0;i<compartments.length;i++) {
			System.out.println("Compartment "+(i+1)+":"+compartments[i].notice()); 
			
		}
		

	}

}
