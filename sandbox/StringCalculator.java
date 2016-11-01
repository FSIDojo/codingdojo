
public class StringCalculator {

    public static int add(String input) {
        if (input.equals("")) return 0;
        return addAll(input.split(",|\n", -1));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            if(temp.equals("")){
                throw new NumberFormatException("Format error");            
            }
            result += Integer.valueOf(temp);
        }
        return result;
    }
 
}
