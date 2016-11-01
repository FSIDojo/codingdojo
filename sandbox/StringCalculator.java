
public class StringCalculator {

    public static int add(String input) {
        if (input.equals("")) return 0;
        String delimiter = ",|\n";
        if(input.startsWith("//")){
            delimiter = input.substring(2,3);
            input = input.substring(4);
        }
        return addAll(input.split(delimiter, -1));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            if(temp.contains("-")){
                throw new NumberFormatException("negatives not allowed -2");
            }
            result += Integer.valueOf(temp);
        }
        return result;
    }
 
}
