
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : split_comma(input);
    }
    
    private static int split_comma(String input){
        String[] parts = input.split(",");
        if(parts.length > 1){
            return addAll(parts);
        }
        return Integer.valueOf(parts[0]);
    }

    private static addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            result += Integer.valueOf(temp) ;
        }
        return result;
    }
 
}
