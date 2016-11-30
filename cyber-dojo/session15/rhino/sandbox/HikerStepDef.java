import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class HikerStepDef {

    private String output;

    @When("^user input (.+) with exactly (\\w+)$")
    public void userInput(String keywords, boolean flag) throws Throwable {
        output = FtsTranslator.translate(flag, keywords);
    }

    @Then("^the translation output will be (.+)$")
    public void translationOutputIs(String expected) throws Throwable {
        assertEquals(expected, output);     
    }
}
