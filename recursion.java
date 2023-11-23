public class recursion {
    public static void main(String[] args) {
        // Test the fibonacci function
        int n = 9; // Example: Find the 9th Fibonacci number
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + ": " + result);
    }

    public static int fibonacci(int n) {
        // Initial call to the recursive Fibonacci function
        return fibonacci_recursive(n);
    }

    private static int fibonacci_recursive(int n) {
        // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }
}
