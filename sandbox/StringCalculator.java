
public class StringCalculator {

    public static int add(String input) {
        return addAll(input.split(",|\n"));
    }

    private static int addAll(String... inputs){
        int result = 0;
        for(String temp : inputs){
            if(!temp.equals("")){
                result += Integer.valueOf(temp) ;
            }
        }
        return result;
    }
 
}
