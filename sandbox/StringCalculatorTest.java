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

    @Test
    public void should_return_sum_from_multiple_string() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void should_accept_newline_as_sparator() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test(expected=NumberFormatException.class)
    public void should_throw_exception_if_format_error() {
         int willFail = StringCalculator.add("1,\n");
         fail("should throw exception");
    }
}