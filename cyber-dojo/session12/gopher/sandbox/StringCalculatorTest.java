import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
    
    @Test(expected=Exception.class)
    public void add_with_delimiter_issue() {
        int actual = StringCalculator.add("1;2");
    }

    @Test
    public void add_with_delimiter_negative() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("negatives not allowed");
        StringCalculator.add("-1,2");
    }

    @Test
    public void add_with_delimiter_negatives() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("negatives not allowed -1 -2");
        StringCalculator.add("-1,-2");
    }

    @Test
    public void add_with_delimiter_negatives_more() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("negatives not allowed -1 -2 -3");
        StringCalculator.add("-1,-2,-3");
    }




}
