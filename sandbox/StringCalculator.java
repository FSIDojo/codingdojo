
public class StringCalculator {

    private static final String COMMA_SPLITTER = ",";

    public static int add(String input) {
       int validateResult = validateInput(input);
       if (validateResult <= 0 ){
          return validateResult;
       }

       String[] splittedInput = input.split(COMMA_SPLITTER);
       return addArgs(splittedInput);
    }

    private static int validateInput(String input){
       if(input == null || input.length() == 0){ 
           return 0;
       }
       input = input.replace("\n", COMMA_SPLITTER);
       if(input.matches(".*?,{2}.*?")){  
          return -1;
       }
    }

    private static int addArgs(String... number){
        int result = 0; 
        for(String temp : number){
           result += Integer.valueOf(temp);
       }
       return result;
    }
}
