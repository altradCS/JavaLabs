// Doch Chanthida
// Thursday 23 November 2023
// ITM 201 001


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Recursion {

    public static void main(String[] args) {
        int n = 10;
        double result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    public static double fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Test case 
    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacci(0), 0);
        assertEquals(1, fibonacci(1), 0);
        assertEquals(1, fibonacci(2), 0);
        assertEquals(2, fibonacci(3), 0);
        assertEquals(3, fibonacci(4), 0);
        assertEquals(5, fibonacci(5), 0);
        assertEquals(8, fibonacci(6), 0);
    }
}
