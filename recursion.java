public class recursion {
    public static void main(String[] args) {
        int n = 10; // Change this to the number you want to calculate
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
