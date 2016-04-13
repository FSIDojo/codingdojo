package dojo.session3;

/**
 * Created by vwu on 4/13/2016.
 */
public class Convertor {

    public static final String I = "I";

    public static String convertRoman(int i) {
        String result = I;
        for (int j = 1; j < i; j++) {
            result += I;
        }
        return result;
    }
}
