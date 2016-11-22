import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void should_convert_string_array_to_int() {
        //given
        Spliter spliter = mock(Spliter.class); 
        NumberParser parser = new NumberParser(spliter);
        when(spliter.split("1")).thenReturn(new String[]{"1"});
        //when
        int[] actual = parser.parse("1");
        //then
        verify(spliter).setDelimiter(",");
        verify(spliter).split("1");
        assertArrayEquals(new int[]{1}, actual);
    }

}