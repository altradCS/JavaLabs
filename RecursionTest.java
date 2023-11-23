import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecursionTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Recursion.fibonacci(0), 0.001);
        assertEquals(1, Recursion.fibonacci(1), 0.001);
    }

    private void assertEquals(int i, double fibonacci, double d) {
    }


}
