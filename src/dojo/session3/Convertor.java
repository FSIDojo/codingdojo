package dojo.session3;

/**
 * Created by vwu on 4/13/2016.
 */
public class Convertor {

    public static final String I = "I";
    public static final String V = "V";

    public static String convertRoman(int i) {
        String result = "";

        if (i >= 5) {
            result = V;
            i = i-5;
        }

        if (i < 5) {
            for (int j = 0; j < i; j++) {
                result += I;
            }
        }

        return result;
    }
}
