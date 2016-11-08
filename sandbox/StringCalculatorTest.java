import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

    @Test
    public void empty_string_get_0() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void single_string_get_x() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void two_string_get_x_add_y() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void get_x_add_y_add_z_with_two_delimiter() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void could_define_delimiter() {
        assertEquals(4, new StringCalculator().add("//;\n1;3"));
    }

    @Test(expected=Exception.class)
    public void throw_exception_if_not_define_delimiter() {
        int fail = new StringCalculator().add("1;3");
        fail("Should fail if not define different delimiter");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throw_exception_if_has_negatives() {
        thrown.expectMessage("negaives not allowed -3");
        int fail = new StringCalculator().add("1,-3");
        fail("Should fail if has negatives");        
    }
}
