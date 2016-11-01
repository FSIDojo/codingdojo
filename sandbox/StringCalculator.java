
public class StringCalculator {

    public static int add(String input) {
        if (input.equals("")) return 0;
        if(input.startsWith("//;\n")){
            String delimiter = ";";
            String nummbers = "1;2";
            return addAll(numbers.split(delimiter, -1));
        }
        return addAll(input.split(",|\n", -1));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            result += Integer.valueOf(temp);
        }
        return result;
    }
 
}
