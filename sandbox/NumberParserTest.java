import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void testParse1() {
//given
        NumberParser parser = new NumberParser();
        int[] result = parser.parse("1,2");
//then   
        assertEquals(2, result.length);
    }

     @Test
    public void testParse2() {
//given
        NumberParser parser = new NumberParser();
        int[] result = parser.parse(",1,2");
//then   
        assertEquals(3, result.length);
    }

}
