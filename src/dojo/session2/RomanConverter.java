package dojo.session2;

import java.util.HashMap;

/**
 * Created by vwu on 3/7/2016.
 */
public class RomanConverter {
    public String doConvert(int passedNumber) {

        HashMap<Integer, String> romanMap = new HashMap<Integer, String>();

        romanMap.put(1, "I");
        romanMap.put(5,"V");
        romanMap.put(10,"X");
        romanMap.put(50,"L");

        String roman = romanMap.get(passedNumber);
        if(roman == null) {
            roman = "";
            int biggestKey = 0;
            for (Integer key : romanMap.keySet())
                if (key < passedNumber) {
                    biggestKey = key;
                }
            for (int j = 0; j < passedNumber; j+=biggestKey) {
                roman += romanMap.get(biggestKey);
            }

        }
        return roman;
    }
}
