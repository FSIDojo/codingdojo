
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        int[] temp;
        if (parser != null) {
           temp = parser.parse(text);
        }
        
        return temp[0] + temp[1];
    }
}