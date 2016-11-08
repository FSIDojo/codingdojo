
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        String splitChar = ",";
        if (numbers.startsWith("//")) {
            splitChar = numbers.charAt(2);
        }
        return add(numbers.split(splitChar + "|\n"));
    }
    
    public static int add(String[] numbers){
        int result = 0;
        if(numbers.length == 1){
            return Integer.valueOf(numbers[0]);
        }
        for(String temp:numbers){
            result += Integer.valueOf(temp);
        }
        return result;
    }
}
