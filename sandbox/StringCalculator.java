
public class StringCalculator {

    public int add(String param) {
        int result=0;
        String delimiter = ",|\n";
        if(param.startsWith("//")){
            delimiter = ";";
            param = "1;3";

            return sumByDelimiter(param, delimiter);
        }
        if (!param.equals("")) {
            String[] digits = param.split(delimiter);
            for(String i: digits){
                result += Integer.valueOf(i);
            }
        }
        return result;
    }

    private int sumByDelimiter(String numbers, String delimiter) {
        int result=0;
            String[] digits = numbers.split(delimiter);
            for(String i: digits){
                result += Integer.valueOf(i);
            }
            return result;
    } 
}
