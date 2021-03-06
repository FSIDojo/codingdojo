import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
        //Given
        NumberParser parser = mock(NumberParser.class);
        int[] shouldReturn = new int[]{2,3};
        when(parser.parse("2,3")).thenReturn(shouldReturn);
        StringCalculator calculator = new StringCalculator(parser);
        //When
        int result = calculator.add("2,3");
        //Then
        assertEquals(result, 5);
    }

    @Test
    public void should_parse_number_from_text_and_sum2 () {
        //Given
        NumberParser parser = mock(NumberParser.class);
        int[] shouldReturn = new int[]{};
        when(parser.parse("")).thenReturn(shouldReturn);
        StringCalculator calculator = new StringCalculator(parser);
        //When
        int result = calculator.add("");
        //Then
        assertEquals(result, 0);
    }

    @Test
    public void should_parse_number_from_text_and_sum3 () {
        //Given
        NumberParser parser = mock(NumberParser.class);
        int[] shouldReturn = new int[]{1};
        when(parser.parse("1")).thenReturn(shouldReturn);
        StringCalculator calculator = new StringCalculator(parser);
        //When
        int result = calculator.add("1");
        //Then
        assertEquals(result, 1);
    }
}