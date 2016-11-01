
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : splict_comma(input);
    }
    
    private static int splict_comma(String input){
        String[] parts = input.split(",");
        if(input.contains(",")){
            return Integer.valueOf(parts[0]) + Integer.valueOf(parts[1]);
        }
        return Integer.valueOf(parts[0]);
    }
}
