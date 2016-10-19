import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void testEmpty() {
        int expected = 0;
        int actual = Hiker.answer("");
        assertEquals(expected, actual);
    }

     @Test
    public void testOne() {
        int expected = 1;
        int actual = Hiker.answer("1");
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int expected = 4;
        int actual = Hiker.answer("1,3");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSpace() {
        int expected = 4;
        int actual = Hiker.answer("4");
        assertEquals(expected, actual);
    }

    @Test
    public void testUnknownLength() {
        int expected = 100;
        int actual = Hiker.answer("10,20,30,40");
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLine() {
        int expected = 6;
        int actual = Hiker.answer("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLine2() {
        int expected = 33;
        int actual = Hiker.answer("//;\n1;2;10;20");
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLine3() {
        int expected = 0;
        int actual = Hiker.answer("//;\n1;2;10:20");
        assertEquals(expected, actual);
    }
    
}
