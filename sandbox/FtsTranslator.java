import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class FtsTranslator{

    public static String translate(boolean flag, String keywords){
        String result = keywords + "*";
        if(keywords.endsWith("**")) {
            result = keywords;
        }
        return result;
    }
}