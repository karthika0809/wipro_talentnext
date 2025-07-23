package collectiion;

interface FactorialCalculator {
    int calculate(int n);
}

// Class with factorial method
class MathUtils {
    public int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Program to use method reference for factorial
public class Collection22 {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        FactorialCalculator calc = math::factorial;
        
        int n = 5;
        System.out.println("Factorial of " + n + ": " + calc.calculate(n));
    }
}
