import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void should_return_empty_from_empty_string() {
        NumberParser parser = new NumberParser();
        assertArrayEquals(new int[]{}, parser.parse(""));
    }

    @Test
    public void should_return_1_from_1_number() {
        NumberParser parser = new NumberParser();
        assertArrayEquals(new int[]{1}, parser.parse("1"));
    }
}