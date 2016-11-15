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
        assertArrayEquals(resultArray, new int[0]);
    }

    @Test
    public void testParser2() {
        //Given
        NumberParser parser = new NumberParser();
        //When
        int[] resultArray = parser.parse("1,2");
        //Then
        assertArrayEquals(resultArray, new int[]{1,2});
    }

}