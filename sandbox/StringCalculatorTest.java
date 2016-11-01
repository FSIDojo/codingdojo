import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_from_empty() {
        assertEquals(0, StringCalculator.add(""));
    }

}