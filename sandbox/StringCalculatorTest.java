import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    StringCalculator caculator = new StringCalculator();

    @Test
    public void zero_from_empty() {
        assertEquals(0, caculator.add(""));
    }

    @Test
    public void one_number_from_single_string() {
        assertEquals(1, caculator.add("1"));
        assertEquals(2, caculator.add("2"));
    }

    @Test
    public void sum_number_from_two_string() {
        assertEquals(3, caculator.add("1,2"));
    }

    @Test
    public void sum_number_from_three_string() {
        assertEquals(10, caculator.add("1,2,7"));
    }

    @Test
    public void should_accept_newline_seperator() {
        assertEquals(10, caculator.add("1\n2,7"));
    }
    
}
