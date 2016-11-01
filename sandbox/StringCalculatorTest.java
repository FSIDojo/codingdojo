import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_from_empty() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void should_return_one_from_one() {
        assertEquals(1, StringCalculator.add("1"));
    }
}