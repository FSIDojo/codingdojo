import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_from_empty() {
        String input = "";
        int expected = 0;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }
}
