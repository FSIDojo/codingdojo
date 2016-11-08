
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        String [] res = purky(numbers);
        retrun add(res);
    }
    
    public static String[] purky(String numbers){    
        String splitChar = ",";
        if (numbers.startsWith("//")) {
            splitChar = numbers.charAt(2) + "";
            numbers = numbers.substring(4);
        }
        return numbers.split(splitChar + "|\n");
    }        

    public static int add(String[] numbers){
        int result = 0;
        for(String temp:numbers){
            result += Integer.valueOf(temp);
        }
        return result;
    }
}
