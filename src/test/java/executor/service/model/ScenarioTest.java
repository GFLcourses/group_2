package executor.service.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ScenarioTest
{
    @Test
    public void checkConstructors()
    {
        Scenario scenario1 = new Scenario();
        assertEquals(scenario1.getName(), null);
        assertEquals(scenario1.getSite(), null);
        assertEquals(scenario1.getSteps, null);
    
        Scenario scenario2 = new Scenario("name", "site", new ArrayList<Step>);
        assertEquals(scenario1.getName(), "name");
        assertEquals(scenario1.getSite(), "site");
        assertEquals(scenario1.getSteps, new ArrayList<Step>());
    }
}
