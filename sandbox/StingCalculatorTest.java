import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
        NumberParser parser = mock(NumberParser.class);
        StringCalculator calculator = new StringCalculator(parser);
        int actual = calculator.add("1,3");
        verify(parser).parse("1,3");
        assertEqulas(4, actual);
    }
}
