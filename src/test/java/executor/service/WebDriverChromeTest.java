package executor.service;

import executor.util.Property;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class WebDriverChromeTest {
    Property property = new Property();

    @Test
    public void TestProperty() {

    List<String> actual;
    actual = Arrays.asList("test1","test2","test3","test4","test5","test6","test7","test8");

         assertEquals(property.connect(),actual);

    }

}
