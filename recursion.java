public class recursion {
    public static void main(String[] args) {
        // Test the countDown method
        System.out.println(countDown(10));
        System.out.println(countDown(5));
    }

    public static String countDown(int n) {
        if (n <= 0) {
            return "Done!";
        } else {
            return n + "\n" + countDown(n - 1);
        }
    }
}