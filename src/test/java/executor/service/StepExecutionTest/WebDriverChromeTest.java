package executor.service.StepExecutionTest;

import executor.service.StepExecution.Property;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WebDriverChromeTest {
    Property property = new Property();

    @Test
    public void TestChrome() {
    List<String> actual;
    actual = Arrays.asList("test1","test2","test3","test4","test5","test6","test7","test8");

         assertEquals(property.connect(),actual);


    }

}