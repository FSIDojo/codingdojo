package dojo.session3;

import dojo.session3.Convertor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vwu on 4/13/2016.
 */
public class RomanTest {
    @Test
    public void test1(){
        assertEquals("I", Convertor.convertRoman(1));
    }

    @Test
    public void test2(){
        assertEquals("II", Convertor.convertRoman(2));
    }
}
