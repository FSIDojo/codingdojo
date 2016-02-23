package dojo.session1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RomanNumeral {
    static Map<Integer, String> noncountable_symbols = new LinkedHashMap<Integer, String>() {
        {
            put(1000, "M");
            put(500, "D");
            put(100, "C");
            put(50, "L");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    public static String valueOf(int i) {
        for (int k : noncountable_symbols.keySet()) {
            if (i >= k) {
                return noncountable_symbols.get(k) + valueOf(i - k);
            }
        }
        return "";
    }
}
