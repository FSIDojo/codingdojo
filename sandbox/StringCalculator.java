
public class StringCalculator {

    private static final String COMMA_SPLITTER = ",";

    public static int add(String input) {
       if(input == null || input.length() == 0){ 
           return 0;
       }
       input = input.replace("\n", COMMA_SPLITTER);
       if(input.matches("\" + COMMA_SPLITTER + "{2}")){  
          return -1;
       }
       String[] splittedInput = input.split(COMMA_SPLITTER);
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
