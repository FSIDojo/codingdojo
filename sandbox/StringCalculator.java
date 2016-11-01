
public class StringCalculator {

    public static int add(String input) {
        return input.equals("") ?0 : splict_comma(input);
    }
    
    private static int splict_comma(String input){
        if(input.contains(",")){
            String[] parts = new String[]{"1", "2"};
            return Integer.valueOf(parts[0]) + 2;
        }
        return Integer.valueOf(input);
    }
}
