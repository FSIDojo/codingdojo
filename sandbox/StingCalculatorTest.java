import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
        NumberParser parser = mock(NumberParser.class);
        StringCalculator calculator = new StringCalculator(parser);
        int result = calculator.add("1,2");
        //verify(parser).parse("1,2");
        int[] a = {1,2};
        when(parser.parse("1,2")).thenReturn(a);
        assertEquals(3, result);
    }
}
