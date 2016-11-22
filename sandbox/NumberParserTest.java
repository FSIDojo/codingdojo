import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void should_set_delimiter_convert_string_array_to_int() {
        //given
        Spliter spliter = mock(Spliter.class); 
        NumberParser parser = new NumberParser(spliter);
        when(spliter.split("1,2,3")).thenReturn(new String[]{"1","2","3"});
        //when
        int[] actual = parser.parse("1,2,3");
        //then
        verify(spliter).setDelimiter(",");
        verify(spliter).split("1,2,3");
        assertArrayEquals(new int[]{1,2,3}, actual);
    }

    @Test
    public void should_set_delimiter_convert_string_array_to_int() {
        //given
        Spliter spliter = mock(Spliter.class); 
        NumberParser parser = new NumberParser(spliter);
        when(spliter.split("1\n2,3")).thenReturn(new String[]{"1","2","3"});
        //when
        int[] actual = parser.parse("1,2,3");
        //then
        verify(spliter).setDelimiter(",");
        verify(spliter).split("1,2,3");
        assertArrayEquals(new int[]{1,2,3}, actual);
    }

}