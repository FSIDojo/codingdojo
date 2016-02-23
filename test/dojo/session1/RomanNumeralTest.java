package dojo.session1;

import dojo.session1.RomanNumeral;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void test1() throws Exception {
        assertEquals("I", RomanNumeral.valueOf(1));
    }
    @Test
    public void test2() throws Exception {
        assertEquals("II", RomanNumeral.valueOf(2));
    }

    @Test
    public void test5() throws Exception {
        assertEquals("V", RomanNumeral.valueOf(5));
    }

    @Test
    public void testSingle() throws Exception {
        assertEquals("X", RomanNumeral.valueOf(10));
        assertEquals("L", RomanNumeral.valueOf(50));
        assertEquals("C", RomanNumeral.valueOf(100));
        assertEquals("D", RomanNumeral.valueOf(500));
        assertEquals("M", RomanNumeral.valueOf(1000));
    }

    @Test
    public void test20() throws Exception {
        assertEquals("XX", RomanNumeral.valueOf(20));
    }

    @Test
    public void test4() throws Exception {
        assertEquals("IV",RomanNumeral.valueOf(4));
    }

    @Test
    public void test9() throws Exception {
        assertEquals("IX",RomanNumeral.valueOf(9));
    }

    @Test
    public void test6() throws Exception {
        assertEquals("VI",RomanNumeral.valueOf(6));
    }

    @Test
    public void test7() throws Exception {
        assertEquals("VII",RomanNumeral.valueOf(7));
    }

}
