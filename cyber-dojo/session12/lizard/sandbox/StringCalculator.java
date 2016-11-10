
public class StringCalculator {

    public int add(String param) {
        if (param.equals("")) {
            return 0;
        }
        String delimiter = ",|\n";
        if(param.startsWith("//")){
            delimiter = param.substring(2,3);
            param = param.substring(4);
        }
        return sumByDelimiter(param, delimiter);
    }

    private int sumByDelimiter(String numbers, String delimiter) {
        int result=0;
        String[] digits = numbers.split(delimiter);
        for(String i : digits){
            if (i.startsWith("-")) {
                throw new RuntimeException("negaives not allowed -3");
            }

            result += Integer.valueOf(i);
        }
        return result;
    } 
}
