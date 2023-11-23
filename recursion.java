/**
 * b. power(x, n): Calculates the power of a number x raised to a non-negative
 * integer n.
 */

public class recursion {

  public static void main(String[] args) {
    int result = power(2, 3);
    System.out.println(result);
  }

  static int power(int x, int n) {
    // Base case: if n is 0, the result is 1
    if (n == 0) {
      return 1;
    }
    // Recursive case: calculate power(x, n) as x times power(x, n-1)
    else {
      return x * power(x, n - 1);
    }
  }
}
