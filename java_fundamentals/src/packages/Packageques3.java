package packages;
abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

public class Packageques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 class Hero extends Vehicle {
		    public String getModelName() {
		        return "Hero Splendor";
		    }

		    public String getRegistrationNumber() {
		        return "AP12 AB1234";
		    }

		    public String getOwnerName() {
		        return "John Doe";
		    }

		    public int getSpeed() {
		        return 80;
		    }

		    public void radio() {
		        System.out.println("Radio functionality in Hero bike.");
		    }
		}
	}

}
