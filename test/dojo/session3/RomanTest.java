package dojo.session3;

import dojo.session3.Convertor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vwu on 4/13/2016.
 */
public class RomanTest {
    @Test
    public void testOne(){
        assertEquals("I", Convertor.convertRoman(1));
    }
}
