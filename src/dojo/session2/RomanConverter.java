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

        return romanMap.get(i);

    }
}
