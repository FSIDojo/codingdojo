import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void empty_string_get_0() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void single_string_get_x() {
        assertEquals(1, new StringCalculator().add("1"));
    }
}
