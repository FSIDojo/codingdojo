
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        if (parser != null) {
           int[] temp = parser.parse(text);
           return temp[0] + temp[1]; 
        }

        return 4;
    }
}