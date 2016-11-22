import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SpliterTest {

    @Test
    public void should_split_string_by_delimiter() {
        Spliter spliter = new Spliter();
        spliter.setDelimiter(",");
        assertArrayEquals(new String[]{"1","2"}, spliter.split("1,2"));
    }
}