
public class Hiker {

    public static int answer(String param) {
        String[] splits = purify(param).split(",");
        int result = 0;
        for (String s : splits) {
            result += Integer.parseInt(s);
        }
        return result ;
    }

    private static String purify(String raw) {
        return param.replace("\n",",");
    }
}
