
public class Hiker {

    public static int answer(String param) {
        String[] splits = purify(param).split(",");
        
       return calc(splits);
        
    }

    private static String purify(String raw) {
        return raw.replace("\n",",");
    }
    private static int calc(String[] splits) {
        int result = 0;
        for (String s : splits) {
            result += Integer.parseInt(s);
        }
        return result ;
    }
}
