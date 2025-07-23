package collectiion;

interface DigitCounter {
    int count(int n);
}

// Class with static digit count method
class MathUtils {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}

// Program to use method reference for digit count
public class Collection23 {
    public static void main(String[] args) {
        DigitCounter counter = MathUtils::digitCount;
        
        int n = 12345;
        System.out.println("Digit count of " + n + ": " + counter.count(n));
    }
}