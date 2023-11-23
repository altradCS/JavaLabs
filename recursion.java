
  public class recursion {
    public static void main(String[] args) {
      //call your recursion function
      //print result
      System.out.println(recursionMethod("Hello World!"));
    }

      public static String recursionMethod(String str) {
          // Base case: if the string is empty, return an empty string
          if (str.isEmpty()) {
              return "";
          }

          // Recursive case: concatenate the last character with the result of the recursion on the substring
          int n = str.length();
          char lastChar = str.charAt(n - 1);
          String result = lastChar + recursionMethod(str.substring(0, n - 1));

          return result;
      }

      
  }
//    public static String recursion(String str) {
//      //implement your case algorithm
//      String result = "";
//      for (int i = str.length(); i < 0; i++) {
//        result += str.charAt(i);
//        }
//
//      return result;
//    }
//

    
