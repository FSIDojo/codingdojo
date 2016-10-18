import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void test_add_with_null() {
        int expected = 0;
        String numbers = "";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    
}
