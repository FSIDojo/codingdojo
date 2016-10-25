
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
        int result = 0;
        if (!"".equals(number)) {
            return Integer.parseInt(number);
        }
        if (number.contains("\n")) {
            String[] numberArray = numbers.split("\n");
            for (String number : numberArray) {
                result += valueOf(number);
            }
            return result;
        }
        return 0;        
    }
}
