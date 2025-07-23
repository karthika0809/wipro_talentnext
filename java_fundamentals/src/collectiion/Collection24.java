package collectiion;

interface PrimeChecker {
    void check(int n);
}

// Class with constructor to check prime
class NumberChecker {
    public NumberChecker(int n) {
        boolean isPrime = n > 1;
        if (isPrime) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}

// Program to use constructor reference for prime check
public class Collection24 {
    public static void main(String[] args) {
        PrimeChecker checker = NumberChecker::new;
        checker.check(17);
        checker.check(24);
    }
}
