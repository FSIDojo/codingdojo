
public class StringCalculator{

    public static int add(String arg) {
        if (!"".equals(arg)) {
            return Integer.parseInt(arg);
        }
        return 0;
    }
}
