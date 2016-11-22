import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void should_return_empty_from_empty_string() {
        NumberParser parser = new Numberparser();
        assertArrayEquals(new int[]{}, parser.parse(""));
    }
}