import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void addWithNull() {
        String input = null; 
        assertEquals(0, StringCalculator.add(input));
    }

    @Test
    public void addWithEmpty() {
        String input = "";
        assertEquals(0, StringCalculator.add(input));
    }

    @Test
    public void addWithOneInput() {
        String input = "1";
        assertEquals(1, StringCalculator.add(input));
    }

    @Test
    public void addWithTwoInput() {
        String input = "1,2";
        assertEquals(3, StringCalculator.add(input));
    }

    @Test
    public void addWithMultipleInput() {
        String input = "1,2,3";
        assertEquals(6, StringCalculator.add(input));
    }

    @Test
    public void addWithMultipleInput() {
        String input = "1\n2,3";
        assertEquals(6, StringCalculator.add(input));
    }
}
