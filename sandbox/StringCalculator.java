
public class StringCalculator{
    static final String SEPERATOR = ",";

    public static int add(String numbers) {
        if (!"".equals(numbers)) {
            if (numbers.contains(SPARATOR)) {
                String[] numberArray = numbers.split(SEPERATOR);
                int result = 0;
                for (String number : numberArray) {
                    result += Integer.parseInt(number);
                }
                return result;
            }
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
