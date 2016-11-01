
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : addAll(input.split(","));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            result += Integer.valueOf(temp) ;
        }
        return result;
    }
 
}
