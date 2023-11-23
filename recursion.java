public class recursion {
    public static void main(String[] args) {
        String testString = "Hello, World!";
        String reversed = reverseString(testString);
        System.out.println("Original String: " + testString);
        System.out.println("Reversed String: " + reversed);

        // Unit test
        assert reverseString("hello").equals("olleh") : "Test Case 1 Failed";
        assert reverseString("12345").equals("54321") : "Test Case 2 Failed";
        assert reverseString("").equals("") : "Test Case 3 Failed";
        System.out.println("All test cases passed.");
    }

    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
