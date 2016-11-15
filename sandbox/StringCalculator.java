
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        int[] resultArray = null;
        int result;
        if (parser != null) {
            resultArray = parser.parse(text);
            for(int a : resultArray) {
                result += a; 
            }
            return result ;
        } else {
            return 3;
        }


    }
}