
public class StringCalculator {

    public static int add(String input) {
       if(input == null || input.length() == 0){ 
           return 0;
       }
       input = input.replace("\n", ",");
       String[] splittedInput = input.split(",");
       return addArgs(splittedInput);
    }

    public static int addArgs(String... number){
        int result = 0; 
        for(String temp : number){
           result += Integer.valueOf(temp);
       }
       return result;
    }
}
