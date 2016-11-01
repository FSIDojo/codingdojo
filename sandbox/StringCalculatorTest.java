import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_from_empty() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void should_return_intvalue_from_single_string() {
        assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public void should_return_sum_from_two_string() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

}