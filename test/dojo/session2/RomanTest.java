package dojo.session2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by vwu on 3/7/2016.
 */
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



}
