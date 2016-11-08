import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void testadd1() {
        int expected = 1;
        int actual = Hiker.answer("1");
        assertEquals(expected, actual);
    }
}
