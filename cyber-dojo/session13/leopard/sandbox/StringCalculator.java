
public class StringCalculator {
    private NumberParser parser;
    
    public StringCalculator(NumberParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
       int[] temp = parser.parse(text);
        
        int result = 0;
        for(int a: temp) {
            result += a;
        }
       return result; 
    }
}