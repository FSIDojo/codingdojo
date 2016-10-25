
public class StringCalculator{

    public static int add(String numbers) {
        if (!"".equals(numbers)) {
            if (numbers.contains(",")) {
                String[] numberArray = numbers.split(",");
                return Integer.parseInt(numberArray[0]) + Integer.parseInt(numberArray[1]);
            }
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
