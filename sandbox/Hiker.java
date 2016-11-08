
public class Hiker {

    public static int answer(String param) throws RuntimeException {
        String[] splits = purify(param).split(",");
        
       return calc(splits);
        
    }

    private static String purify(String raw) {
        if(!raw.startsWith("//")) {
            return raw.replace("\n",",");
        } else {
            String[] arry = raw.split("\n");
            String delimiter = arry[0].substring(2);
            return arry[1].replace(delimiter, ",");         
        }
        
    }
    private static int calc(String[] splits) throws RuntimeException {
        int result = 0;
        String negatives = "";
        for (String s : splits) {
            int value = Integer.parseInt(s);
            if (value < 0) {
                negatives += value+","; 
            }
            result += Integer.parseInt(s);
        }
        if (negatives.length() > 0) {
            throw new RuntimeException (negatives);
        }
        return result ;
    }
}
