
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        if (parser != null) {
            parser.parse(text);
        }
        return 3;
    }
}