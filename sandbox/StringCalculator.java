
public class StringCalculator {

    public static int add(String param) {
        if (!param.equals("")) {
            return Integer.valueOf(param);
        }
        return 0;
    }
}
