import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberParserTest {

    @Test
    public void testParser() {
        //Given
        NumberParser parser = new NumberParser();
        //When
        int[] resultArray = parser.parse("");
        //Then
        assertEquals(resultArray, new int[0]);
    }

}