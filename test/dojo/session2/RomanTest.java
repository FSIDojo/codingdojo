package dojo.session2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanTest {
    RomanConverter converter = new RomanConverter();
    @Test
    public void testSingle() throws Exception {
        assertEquals("I", converter.doConvert(1));
    }

    @Test
    public void testSingleV() throws Exception {
        assertEquals("V", converter.doConvert(5));
    }

    @Test
    public void testSingleX() throws Exception {
        assertEquals("X", converter.doConvert(10));
    }

    @Test
    public void testSingleL() throws Exception {
        assertEquals("L", converter.doConvert(50));

    }

    @Test
    public void testCompose2() throws Exception {
        assertEquals("II", converter.doConvert(2));
    }
    @Test
    public void testCompose20() throws Exception {
        assertEquals("XX", converter.doConvert(20));
    }

    @Test
    public void testCompose15() throws Exception {
        assertEquals("XV", converter.doConvert(15));
    }

    @Test
    public void testCompose25() throws Exception {
        assertEquals("XXV", converter.doConvert(25));
    }

    @Test
    public void testCompose3() throws Exception {
        assertEquals("III", converter.doConvert(3));
    }

    @Test
    public void testCompose6() throws Exception {
        assertEquals("VI", converter.doConvert(6));
    }

    @Test
    public void testCompose16() throws Exception {
        assertEquals("XVI", converter.doConvert(16));
    }
}
