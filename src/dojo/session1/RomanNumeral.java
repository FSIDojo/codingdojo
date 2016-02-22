package dojo.session1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by vwu on 2/22/2016.
 */
public class RomanNumeral {
    static Map<Integer, String> countable_symbols = new LinkedHashMap<Integer, String>() {
        {
            put(10, "X");
            put(1, "I");
        }
    };
    static Map<Integer, String> noncountable_symbols = new HashMap<Integer, String>() {
        {
            put(50, "L");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
        }
    };

    public static String valueOf(int i) {
//        30 = 10 + 20 X + X + X
//        for noncountable_symbols
//        50, 10, 9, 5, 4, 1
        if (i > 5 && i < 9) {
            return valueOf(5) + valueOf(i-5);
        }
        if (noncountable_symbols.containsKey(i)) return noncountable_symbols.get(i);
        for (int digital : countable_symbols.keySet()) {
            if (i % digital == 0) {
                String numeral = repeatChar(i, digital);
                return numeral;
            }
        }
        return "";
    }

    private static String repeatChar(int i, int digital) {
        String numeral = "";
        for (int j = 0; j < i; j += digital) {
            numeral += countable_symbols.get(digital);
        }
        return numeral;
    }
}
