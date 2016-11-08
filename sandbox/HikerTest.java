import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void oneTwo() {
        int expected = 3;
        String actual = Hiker.add("1,2");
        assertEquals(expected, actual);
    }
}
