import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void testParse1() {
//given
        NumberParser parser = new NumberParser();
        int[] a = {1,2};
        int[] result = parser.parse("1,2");

//then   
        assertEquals(2, result.length);
    }

}
