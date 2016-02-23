package dojo.session1;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    static Map<Integer, String> symbols = new LinkedHashMap<Integer, String>() {
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "LC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    public static String valueOf(int i) {
        for (int k : symbols.keySet()) {
            if (i >= k) {
                return symbols.get(k) + valueOf(i - k);
            }
        }
        return "";
    }
}
