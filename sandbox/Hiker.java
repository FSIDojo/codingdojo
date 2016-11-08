
public class Hiker {

    public static int answer(String param) {
        String[] splits = purify(param).split(",");
        
       return calc(splits);
        
    }

    private static String purify(String raw) {
        if(raw.startsWith("//")) {
            return raw.replace("\n",",");
        } else {
            String[] arry = raw.split("\n");
            String delimiter = arry[0].substring(2);
            return arry[1].replace(delimiter, ",");
            
        }
        
    }
    private static int calc(String[] splits) {
        int result = 0;
        for (String s : splits) {
            result += Integer.parseInt(s);
        }
        return result ;
    }
}
