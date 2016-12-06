import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class SearchStepDef {

    @Given("^the text content:$")
    public void theTextContent(List<String> text) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }
    
    @When("^I input \"([^\"]*)\"$")
    public void iInput(String words) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @Then("^the result will be: \"([^\"]*)\"$")
    public void theResultWillBe(String searchResult) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
        
}
