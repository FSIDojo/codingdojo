import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void space() {
        int expected = 0;
        int actual = StringCalculator.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void one() {
        int expected = 1;
        int actual = StringCalculator.add("1");
        assertEquals(expected, actual);
    }

    @Test
    public void oneTwo() {
        int expected = 3;
        int actual = StringCalculator.add("1,2");
        assertEquals(expected, actual);
    }
    
    @Test
    public void add_with_new_line() {
        int actual = StringCalculator.add("1\n2,3");
        assertEquals(6, actual);
    }

    @Test
    public void add_with_delimiter() {
        int actual = StringCalculator.add("//;\n1;2");
        assertEquals(3, actual);
    }
}
