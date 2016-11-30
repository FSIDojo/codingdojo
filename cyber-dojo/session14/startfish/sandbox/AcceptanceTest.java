import org.junit.*;
import static org.junit.Assert.*;

public class AcceptanceTest {
    private Spliter spliter = new Spliter();
    private NumberParser parser = new NumberParser(spliter);
    private StringCalculator calculator = new StringCalculator(parser);

    @Test
    public void shoud_add_numbers_in_string() {
        assertEquals(3, calculator.add("1,2")); 
    }


    @Test
    public void shoud_add_numbers_with_newline() {
        assertEquals(6, calculator.add("1\n2,3")); 
    }

}