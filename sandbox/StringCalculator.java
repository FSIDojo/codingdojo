
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
            if(resultArray != null) {
                result = resultArray[0] + resultArray[1];
            }        
            return result ;
        } else {
            return 3;
        }


    }
}