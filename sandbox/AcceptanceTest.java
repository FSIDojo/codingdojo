import org.junit.*;
import static org.junit.Assert.*;

public class AcceptanceTest {

    @Test
    public void shoud_add_numbers_in_string() {
        StringCalculator calculator = new StringCalculator(null);
        assertEquals(3, calculator.add("1,2")); 
    }

}