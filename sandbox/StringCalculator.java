
public class StringCalculator{

    public static int add(String numbers) {
        if (!"".equals(numbers)) {
            if (numbers.contains(",")) {
                String[] numberArray = numbers.split(",");
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
