import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SearchWorkerTest {

    @Test
    public void testSearch() {
        List<String> results = new SearchWorker().search("five");
        assertEquals("Four little, five little, six little Indian", results.get(0));
    }
}