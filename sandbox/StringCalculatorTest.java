import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void addWithNull() {
        String input = null;
        int expected = 0;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void addWithEmpty() {
        String input = "";
        int expected = 0;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void addWithOneInput() {
        String input = "1";
        int expected = 1
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }
}
