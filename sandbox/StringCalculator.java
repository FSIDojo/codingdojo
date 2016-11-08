
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        return addArray(purky(numbers));
    }
    
    public static String[] purky(String numbers){    
        String splitChar = ",";
        if (numbers.startsWith("//")) {
            splitChar = numbers.charAt(2) + "";
            numbers = numbers.substring(4);
        }
        return numbers.split(splitChar + "|\n");
    }        

    public static int addArray(String[] numbers){
        int result = 0;
        for(String temp:numbers){
            result += Integer.valueOf(temp);
        }
        return result;
    }
}
