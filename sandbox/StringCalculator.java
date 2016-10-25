
public class StringCalculator {

    public static int add(String input) {
       if(input == null || input.length() == 0){ 
           return 0;
       }
       String[] splittedInput = input.split(",");
       if (splittedInput.length == 1)
           return splittedInput[0];
       else if (splittedInput.length == 2) 
           return  splittedInput[0] + splittedInput[1];
    }
}
