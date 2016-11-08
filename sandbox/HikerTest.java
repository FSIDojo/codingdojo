import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void testadd1() {
        int expected = 1;
        int actual = Hiker.answer("1");
        assertEquals(expected, actual);
    }
    @Test
    public void testadd3() {
        int expected = 3;
        int actual = Hiker.answer("1,2");
        assertEquals(expected, actual);
    }

    @Test
    public void testadd3digits() {
        int expected = 7;
        int actual = Hiker.answer("1,2,4");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNewLine() {
        int expected = 3;
        int actual = Hiker.answer("1\n2");
        assertEquals(expected, actual);
    }
    @Test
    public void testNewLineAndComma() {
        int expected = 6;
        int actual = Hiker.answer("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test(expected=Exception.class)
    public void testSlash() {
        int expected = 5;
        int actual = Hiker.answer("2;3");
    }
    
    @Rule
    public ExpectedException expectedEx = ExpectedException.none(); 
  
    @Test
    public void testNegative() throws RuntimeException  {
        int actual = Hiker.answer("-2,3");
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("-2,");
    }  
}
