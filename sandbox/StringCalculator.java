
public class StringCalculator {

    public static int add(String param) {
        int result=0;
        if (!param.equals("")) {
            String[] digits = param.split(",");
            for(String i: digits){
                result += Integer.valueOf(i);
            }
        }
        return result;
    }
}
