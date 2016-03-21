package dojo.session2;

import java.util.HashMap;

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

            int leftPart = passedNumber;
            for (int j = 0; j < passedNumber; j+=biggestKey) {
                if (leftPart < biggestKey) {
                    if(leftPart == 6) {
                        roman += romanMap.get(5) + romanMap.get(1);
                    } else {
                        roman += romanMap.get(leftPart);
                    }
                } else {
                    roman += romanMap.get(biggestKey);
                    leftPart = leftPart - biggestKey;
                }
            }

        }
        return roman;
    }
}
