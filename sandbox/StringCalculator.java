
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : splict_comma(input);
    }
    
    private static int splict_comma(String input){
        if(input.contains(",")){
            String[] parts = input.split(",");
            return Integer.valueOf(parts[0]) + Integer.valueOf(parts[1]);
        }
        return Integer.valueOf(input);
    }
}
