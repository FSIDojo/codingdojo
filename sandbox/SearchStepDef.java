import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class SearchStepDef {

    @Given("^the text content:$")
    public void theTextContent(List<String> text) throws Throwable {
    }
    
    @When("^I input \"([^\"]*)\"$")
    public void iInput(String words) throws Throwable {
    }
    
    @Then("^the result will be: \"([^\"]*)\"$")
    public void theResultWillBe(String searchResult) throws Throwable {
    }
        
}
