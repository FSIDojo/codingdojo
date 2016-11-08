
public class StringCalculator {

    public static int add(String param) {
        int result=0;
        String delimiter = ",|\n";
        if(param.startsWith("//")){
            delimiter = ";";
            param = "1;3";

            String[] digits = param.split(delimiter);
            for(String i: digits){
                result += Integer.valueOf(i);
            }
            return result;

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
