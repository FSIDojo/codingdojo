import org.junit.*;
import static org.junit.Assert.*;

public class AcceptanceTest {

    @Test
    public void shoud_add_numbers_in_string() {
        StringCalculator calculator = new StringCalculator(new NumberParser());
        assertEquals(4, calculator.add("1,3")); 
    }

    @Test
    public void shoud_add_numbers_in_string2() {
        StringCalculator calculator = new StringCalculator(new NumberParser());
        assertEquals(6, calculator.add("1\n2,3")); 
    }
}