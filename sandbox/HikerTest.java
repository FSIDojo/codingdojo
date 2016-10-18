import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void testEmpty() {
        int expected = 0;
        int actual = Hiker.answer("");
        assertEquals(expected, actual);
    }
}
