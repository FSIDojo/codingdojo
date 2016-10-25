import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void zero_from_empty() {
        StringCalculator caculator = new StringCalculator();
        int expected = 0;
        int actual = caculator.add("");
        assertEquals(expected, actual);
    }
}
