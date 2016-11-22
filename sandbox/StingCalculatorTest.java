import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StingCalculatorTest {
    private NumberParser parser;
    private StringCalculator calculator;

    @Before
    public setup() {
        parser = mock(NumberParser.class);
        calculator = new StringCalculator(parser);
    }

    @Test
    public void should_parse_number_from_text_and_sum() {
        //given
        when(parser.parse("1,3")).thenReturn(new int[]{1,3});
        //when
        int actual = calculator.add("1,3");
        //then
        verify(parser).parse("1,3");
        assertEquals(1+3, actual);
    }

    @Test
    public void should_return_single_number() {
        //given
        when(parser.parse("1")).thenReturn(new int[]{1});
        //when
        int actual = calculator.add("1");
        //then
        verify(parser).parse("1");
        assertEquals(1, actual);
    }
}
