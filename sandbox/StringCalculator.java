
public class StringCalculator {

    public static int add(String input) {
       if(input == null || input.length() == 0){ 
           return 0;
       }
       String[] splittedInput = input.split(",");
       if (splittedInput.length == 1)
           return addArgs(splittedInput);
       else if (splittedInput.length == 2) 
           return addArgs(splittedInput);
       return 0; 
    }

    public static int addArgs(String... number){
        int result = 0; 
        for(String temp : number){
           result += Integer.valueOf(temp);
       }
       return result;
    }
}
