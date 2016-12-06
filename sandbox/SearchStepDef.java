import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;
import cucumber.api.*;

public class SearchStepDef {

    @Given("^the text content:$")
    public void theTextContent(List<String> text) throws Throwable {
        throw new PendingException();
    }
    

    @When("^I search <([^>]*)>$")
    public void iSearchIndian(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
        
    @Then("^the result will be: \"([^\"]*)\"$")
    public void theResultWillBe(String arg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^the result will be:$")
    public void theResultWillBe(List<String> result) throws Throwable {

        throw new PendingException();
    } 
}
