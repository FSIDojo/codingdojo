
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        if (parser != null) {
            int[] temp = parser.parse(text);
            int result;
            for(int a:temp){
                result +=a;
            }
            return result;
        }
        return 3;
    }
}