import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;
import cucumber.api.*;

public class SearchStepDef {
    List<String> results;

    @Given("^the text content:$")
    public void theTextContent(List<String> text) throws Throwable {
        
    }
    

    @When("^I search <([^>]*)>$")
    public void iSearchIndian(String input) throws Throwable {
        SearchWorker worker = new SearchWorker();
        results = worker.search(input);
    }
  
    @Then("^the result will be:$")
    public void theResultWillBe(List<String> expected) throws Throwable {
        assertEquals(expected, results);
    } 
}
