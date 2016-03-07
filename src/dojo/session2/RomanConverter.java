package dojo.session2;

import java.util.HashMap;

/**
 * Created by vwu on 3/7/2016.
 */
public class RomanConverter {
    public String doConvert(int i) {

        HashMap<Integer, String> romanMap = new HashMap<Integer, String>();

        romanMap.put(1, "I");
        romanMap.put(5,"V");
        romanMap.put(10,"X");
        romanMap.put(50,"L");

        String roman = romanMap.get(i);

        if(roman == null){
            roman = "";
            for(Integer key : romanMap.keySet())
                if (key < i) {
                    for (int j = 0; j < i; j++) {
                        roman += romanMap.get(key);
                    }
                }
        }
        return roman;
    }
}
