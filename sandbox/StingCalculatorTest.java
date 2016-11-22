import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {

    @Test
    public void should_parse_number_from_text_and_sum () {
        //given
        NumberParser parser = mock(NumberParser.class);
        StringCalculator calculator = new StringCalculator(parser);
        when(parser.parse("1,3")).thenReturn(new int[]{1,3});
        //when
        int actual = calculator.add("1,3");
        //then
        verify(parser).parse("1,3");
        assertEquals(1+3, actual);
    }
}
