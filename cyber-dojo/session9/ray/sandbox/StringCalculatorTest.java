import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void test_add_with_null() {
        int expected = 0;
        String numbers = null;
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_empty() {
        int expected = 0;
        String numbers = "";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }    

    @Test
    public void test_add_with_one() {
        int expected = 1;
        String numbers = "1";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }
 
    @Test
    public void test_add_with_two() {
        int expected = 3;
        String numbers = "1,2";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_unknown_amount_of_numbers(){
        int expected = 6;
        String numbers = "1,2,3";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_new_line(){
        int expected = 6;
        String numbers = "1\n2,3";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_new_line_v2(){
        int expected = 6;
        String numbers = "1\n2\n3";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_new_line_v3(){
        int expected = 3;
        String numbers = "//;\n1;2";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_with_new_line_v4(){
        int expected = 3;
        String numbers = "//;\n1\n;2";
        int actual = StringCalculator.add(numbers);
        assertEquals(expected, actual);
    }
}
