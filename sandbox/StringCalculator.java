
public class StringCalculator{
    static final String SEPERATOR = ",";

    public int add(String numbers) {
        {
        int result = 0;
        if (numbers.contains("\n")) {
            String[] numberArray = numbers.split("\n");
            for (String num : numberArray) {
                result += valueOf(num);
            }
            return result;
        }
        }
        String[] numberArray = numbers.split(SEPERATOR);
        int result = 0;
        for (String number : numberArray) {
            result += valueOf(number);
        }
        return result;
    }

    private int valueOf(String number) {
        if (!"".equals(number)) {
            return Integer.parseInt(number);
        }
        
        return 0;        
    }
}
