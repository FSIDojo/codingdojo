import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
        //Given
        NumberParser parser = mock(NumberParser.class);
        int[] shouldReturn = new int[]{1,2};
        when(parse.parse("1,2")).thenReturn(shouldReturn);
        StringCalculator calculator = new StringCalculator(parser);
        //When
        int result = calculator.add("1,2");
        //Then
        AssertEqual(result, 3);
    }
}