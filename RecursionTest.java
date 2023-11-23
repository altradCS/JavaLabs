import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecursionTest {
    @Test
    public void testFibonacci() {
        assertEquals(0, Recursion.fibonacci(0));
        assertEquals(1, Recursion.fibonacci(1));
        assertEquals(1, Recursion.fibonacci(2));
        assertEquals(2, Recursion.fibonacci(3));
        assertEquals(3, Recursion.fibonacci(4));
        assertEquals(5, Recursion.fibonacci(5));
        assertEquals(8, Recursion.fibonacci(6));
        // Add more assertions as needed
    }
}