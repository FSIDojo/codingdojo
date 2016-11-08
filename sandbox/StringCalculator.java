
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        return add(numbers.split(",|\n"));
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
