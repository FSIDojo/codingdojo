
public class StringCalculator {

    public static int add(String param) {
        String delimiter = ",";
        int result=0;
        if (param.contains("\n")) {
            delimiter = "\n";
        }
        if (!param.equals("")) {
            String[] digits = param.split(delimiter);
            for(String i: digits){
                result += Integer.valueOf(i);
            }
        }
        return result;
    }
}
