import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Rule 
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void should_throw_exception_if_format_error() {
         thrown.expect(NumberFormatException.class);
         int willFail = StringCalculator.add("1\n,");
    }

    @Test
    public void should_sum_if_different_delimiters() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void should_throw_exception_to_negative_numbers() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("negatives not allowed -2");
        int willFail = StringCalculator.add("1,-2");
    }

}