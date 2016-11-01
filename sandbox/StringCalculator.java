
public class StringCalculator {

    public static int add(String input) {
        if (input.equals("")) return 0;
        String delimiter = ",|\n";
        String numbers = input;
        if(input.startsWith("//")){
            String[] parts = input.split("\n");
            delimiter = parts[0].substring(2);
            numbers = input.substring(4);
        }
        return addAll(numbers.split(delimiter, -1));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            result += Integer.valueOf(temp);
        }
        return result;
    }
 
}
