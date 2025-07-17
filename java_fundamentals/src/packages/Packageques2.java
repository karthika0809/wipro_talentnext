package packages;
import java.util.*;




 class Logan extends Packageques3 {
    public String getModelName() {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() {
        return "MH20 GH6789";
    }

    public String getOwnerName() {
        return "Bob";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        System.out.println("GPS is enabled.");
        return 1;
    }
}

 class Ford extends Packageques2 {
    public String getModelName() {
        return "Ford Ecosport";
    }

    public String getRegistrationNumber() {
        return "KA05 IJ2345";
    }

    public String getOwnerName() {
        return "Charlie";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        System.out.println("Temperature control is set.");
        return 22;
    }
}


public class Packageques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero();
        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("----------");

        Honda honda = new Honda();
        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();

        System.out.println("----------");

        Logan logan = new Logan();
        System.out.println(logan.getModelName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getOwnerName());
        System.out.println("Speed: " + logan.speed());
        logan.gps();

        System.out.println("----------");

        Ford ford = new Ford();
        System.out.println(ford.getModelName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getOwnerName());
        System.out.println("Speed: " + ford.speed());
        ford.tempControl();
    }


	}


