package dojo.session2;

import java.util.HashMap;

public class RomanConverter {

    static private HashMap<Integer, String> romanMap =
    new HashMap<Integer, String>(){{
        put(1, "I");
        put(5,"V");
        put(10,"X");
        put(50,"L");
    }};

    public String doConvert(int passedNumber) {
        int biggestKey = getBiggestKey(passedNumber);
        String roman = romanMap.get(passedNumber);
        if(roman == null) {
            roman = "";
            roman += romanMap.get(biggestKey);
            roman += doConvert(passedNumber - biggestKey);
        }
        return roman;
    }

    private int getBiggestKey(int passedNumber) {
        int biggestKey = 0;
        for (Integer key : romanMap.keySet())
            if (key < passedNumber) {
                biggestKey = key;
            }
        return biggestKey;
    }
}
