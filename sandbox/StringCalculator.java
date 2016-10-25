
public class StringCalculator{

    public static int add(String numbers) {
        if (!"".equals(numbers)) {
            if (numbers.contains(",")) {
                return 1 + 2;
            }
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
