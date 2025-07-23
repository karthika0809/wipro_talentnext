package interfaces;

interface Test {
    int myFunction(int a, int b, int c);
}

public class LambdaTest {
    public static void main(String[] args) {
        // t1: Adds three integers
        Test t1 = (a, b, c) -> a + b + c;
        
        // t2: Multiplies three integers
        Test t2 = (a, b, c) -> a * b * c;
        
        // Test t1 with values 2, 3, 4
        System.out.println("t1 result (sum): " + t1.myFunction(2, 3, 4));
        
        // Test t2 with values 2, 3, 4
        System.out.println("t2 result (product): " + t2.myFunction(2, 3, 4));
    }
}
