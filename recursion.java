public class RecursionMain {
    
        public static String reverseString(String str) {
            if (str.isEmpty()) {
                return str;
            } else {
                return reverseString(str.substring(1)) + str.charAt(0);
            }
        }
    
        public static void main(String[] args) {
            String result = reverseString("Hello"); // Change this value to test different cases
            System.out.println(result);
        }

}
