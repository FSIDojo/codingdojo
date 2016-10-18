import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 0;
        int actual = Hiker.answer(null);
        assertEquals(expected, actual);
    }


    @Test
    public void one() {
        int expected = 1;
        int actual = Hiker.answer("1");
        assertEquals(expected, actual);
    }
    @Test
    public void two() {
        int expected = 2;
        int actual = Hiker.answer("2");
        assertEquals(expected, actual);
    }

    @Test
    public void oneAnd() {
        int expected = 1;
        int actual = Hiker.answer("1,");
        assertEquals(expected, actual);
    }
    @Test
    public void spaceAndOne() {
        int expected = 1;
        int actual = Hiker.answer("1, ");
        assertEquals(expected, actual);
    }
}
