
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        String splitChar = ",";
        if (numbers.startsWith("//")) {
            splitChar = numbers.charAt(2) + "";
            numbers = numbers.substring(4);
        }
        return add(numbers.split(splitChar + "|\n"));
    }
    
    public static int add(String[] numbers){
        int result = 0;
        for(String temp:numbers){
            result += Integer.valueOf(temp);
        }
        return result;
    }
}
