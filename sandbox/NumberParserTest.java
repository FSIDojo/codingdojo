import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void should_return_empty_from_empty_string() {
        //given
        Spliter spliter = mock(Spliter.class); 
        NumberParser parser = new NumberParser(spliter);
        when(spliter.split("")).thenReturn(new String[]{});
        //when
        int[] actual = parser.parse("");
        //then
        varify(spliter).setDelimiter(",");
        varify(spliter).split("");
        assertArrayEquals(new int[]{}, actual);
    }
/*
    @Test
    public void should_return_1_from_1_number() {
        NumberParser parser = new NumberParser();
        assertArrayEquals(new int[]{1}, parser.parse("1"));
    }

    @Test
    public void should_return_2_from_2_number() {
        NumberParser parser = new NumberParser();
        assertArrayEquals(new int[]{2,3}, parser.parse("2,3"));
    }
*/
}