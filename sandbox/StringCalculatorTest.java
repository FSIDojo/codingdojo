import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void empty_string_get_0() {
        int actual = new StringCalculator().add("");
        assertEquals(0, actual);
    }
}
