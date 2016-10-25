
public class StringCalculator{
    static final String SEPERATOR = ",";

    public int add(String numbers) {
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
