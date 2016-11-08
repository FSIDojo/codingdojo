
public class Hiker {

    public static int answer(String param) {
        String newParam = param.replace("\n",",");
        String[] splits = newParam .split(",");
        int result = 0;
        for (String s : splits) {
            result += Integer.parseInt(s);
        }
        return result ;
    }
}
