import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class recursionTest {
    @Test
    public void testCountDown() {
        assertEquals("5\n4\n3\n2\n1\nDone!", recursion.countDown(5));
        assertEquals("3\n2\n1\nDone!", recursion.countDown(3));
    }
}