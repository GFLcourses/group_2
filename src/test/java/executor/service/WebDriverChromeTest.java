package executor.service;

import executor.util.Property;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WebDriverChromeTest {
    @Test
    public void TestProperty() {
        int actual = 10;
        int expected = Integer.parseInt(Property.getProperty("ThreadPoolConfig.corePoolSize"));

        assertEquals(expected, actual);
    }

}