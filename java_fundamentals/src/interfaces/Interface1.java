package interfaces;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Veena is playing...");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Saxophone is playing...");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        // a. Create and test Veena instance
        Veena veena = new Veena();
        veena.play();
        
        // b. Create and test Saxophone instance
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        
        // c. Use Playable type for both instances
        Playable playableVeena = veena;
        Playable playableSaxophone = saxophone;
        
        playableVeena.play();
        playableSaxophone.play();
    }
}