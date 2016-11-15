import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
//given
        NumberParser parser = mock(NumberParser.class);
        int[] a = {1,2};
        when(parser.parse("1,2")).thenReturn(a);
        StringCalculator calculator = new StringCalculator(parser);
//when
        int result = calculator.add("1,2");

//then   
        assertEquals(3, result);
    }

    
    @Test
    public void should_parse_number_from_text_and_sum2 () {
//given
        NumberParser parser = mock(NumberParser.class);
        int[] a = {1,2,4};
        when(parser.parse("1,2,4")).thenReturn(a);
        StringCalculator calculator = new StringCalculator(parser);
//when
        int result = calculator.add("1,2,4");

//then   
        assertEquals(7, result);
    }

    @Test
    public void should_parse_number_from_text_and_sum3 () {
//given
        NumberParser parser = mock(NumberParser.class);
        int[] a = {};
        when(parser.parse("")).thenReturn(a);
        StringCalculator calculator = new StringCalculator(parser);
//when
        int result = calculator.add("");

//then   
        assertEquals(0, result);
    }
}
