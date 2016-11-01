import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void StringCalculator() {
        String input = "";
        int expected = 42;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }
}
