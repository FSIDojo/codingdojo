package dojo.session3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vwu on 4/13/2016.
 */
public class Convertor {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public static Map<Integer, String> romanMap = new HashMap<>();
    public static int[] roman = new int[]{5, 10};

    public static String convertRoman(int i) {
        romanMap.put(1, "I");
        romanMap.put(5, "V");
        romanMap.put(10, "X");
        String result = "";
        for (int k = roman.length - 1; k >= 0; k--) {
            if (i >= roman[k]) {
                result = romanMap.get(roman[k]);
                i = i - roman[k];
            }
        }

        for (int j = 0; j < i; j++) {
            result += romanMap.get(1);
        }

        return result;
    }


}
