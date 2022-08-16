package executor.model;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ScenarioTest
{
    @Test
    public void checkConstructors()
    {
        Scenario scenario1 = new Scenario();
        assertNull(scenario1.getName());
        assertNull(scenario1.getSite());
        assertNull(scenario1.getSteps());
        
        Scenario scenario2 = new Scenario("name", "site", new ArrayList<>());
        assertEquals(scenario2.getName(), "name");
        assertEquals(scenario2.getSite(), "site");
        assertEquals(scenario2.getSteps(), new ArrayList<Step>());
    }
}
