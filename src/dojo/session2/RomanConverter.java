package dojo.session2;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {

    static private Map<Integer, String> romanMap =
    new LinkedHashMap<Integer, String>(){{
        put(1, "I");
        put(5,"V");
        put(10,"X");
        put(50,"L");
        put(100,"C");
    }};

    public String doConvert(int passedNumber) {
        if (passedNumber == 0) return "";
        int biggestKey = getBiggestKey(passedNumber);
        return romanMap.get(biggestKey)
                + doConvert(passedNumber - biggestKey);
    }

    private int getBiggestKey(int passedNumber) {
        int biggestKey = 0;
        for (Integer key : romanMap.keySet())
            if (key <= passedNumber) {
                biggestKey = key;
            }
        return biggestKey;
    }
}
