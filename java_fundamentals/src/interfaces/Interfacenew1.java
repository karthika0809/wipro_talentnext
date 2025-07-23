package interfaces;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class Interfacenew1 implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message(); // Call Vehicle's default method
    }
    
    public static void main(String[] args) {
        Interfacenew1 car = new Interfacenew1();
        car.message();
    }
}
