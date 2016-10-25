import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    StringCalculator caculator = new StringCalculator();

    @Test
    public void zero_from_empty() {
        assertEquals(0, caculator.add(""));
    }

    @Test
    public void one_from_one() {
        assertEquals(1, caculator.add("1"));
    }


}
