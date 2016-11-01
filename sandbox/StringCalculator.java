
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : split_comma(input);
    }
    
    private static int split_comma(String input){
        String[] parts = input.split(",");
        if(parts.length > 1){
            return Integer.valueOf(parts[0]) + Integer.valueOf(parts[1]);
        }
        return Integer.valueOf(parts[0]);
    }
}
