import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionMainTest {
    @Test
    public void testReverseString() {
        assertEquals("", RecursionMain.reverseString(""));
        assertEquals("a", RecursionMain.reverseString("a"));
        assertEquals("ba", RecursionMain.reverseString("ab"));
        assertEquals("olleH", RecursionMain.reverseString("Hello"));
        assertEquals("edocavaJ", RecursionMain.reverseString("Java code"));
    }
}