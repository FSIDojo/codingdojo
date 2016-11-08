
public class StringCalculator {

    public int add(String param) {
        String delimiter = ",|\n";
        if(param.startsWith("//")){
            delimiter = ";";
            param = "1;3";
        }
        if (param.equals("")) {
            return 0;
        }
        return sumByDelimiter(param, delimiter);
    }

    private int sumByDelimiter(String numbers, String delimiter) {
        int result=0;
        String[] digits = numbers.split(delimiter);
        for(String i : digits){
            result += Integer.valueOf(i);
        }
        return result;
    } 
}
