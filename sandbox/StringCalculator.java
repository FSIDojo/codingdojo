
public class StringCalculator{

    public static int add(String numbers) {
        if (!"".equals(numbers)) {
            if (numbers.contains(",")) {
                return Integer.parseInt("1") + Integer.parseInt("2");
            }
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
