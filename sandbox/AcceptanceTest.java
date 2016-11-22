import org.junit.*;
import static org.junit.Assert.*;

public class AcceptanceTest {

    @Test
    public void shoud_add_numbers_in_string() {
        Spliter spliter = new Spliter();
        NumberParser parser = new NumberParser(spliter);
        StringCalculator calculator = new StringCalculator(parser);
        assertEquals(3, calculator.add("1,2")); 
    }

}