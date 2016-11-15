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
}