import org.junit.*;
import static org.junit.Assert.*;

public class SpliterTest {

    @Test
    public void should_split_string_by_delimiter() {
        Spliter spliter = new Spliter();
        spliter.setDelimiter(",");
        assertArrayEquals(new String[]{"1","2"}, spliter.split("1,2"));
    }

    @Test
    public void should_split_string_by_2_delimiters() {
        Spliter spliter = new Spliter();
        spliter.setDelimiter(",|\n");
        assertArrayEquals(new String[]{"1","2","3"}, spliter.split("1,2\n3"));
    }

}