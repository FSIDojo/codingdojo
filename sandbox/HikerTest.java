import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void space() {
        int expected = 0;
        int actual = Hiker.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void oneTwo() {
        int expected = 3;
        int actual = Hiker.add("1,2");
        assertEquals(expected, actual);
    }


}
