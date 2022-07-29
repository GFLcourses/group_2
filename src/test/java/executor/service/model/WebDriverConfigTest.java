package executor.service.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WebDriverConfigTest {

    private static final String ANOTHER_WEB_DRIVER_EXECUTABLE = "AnotherWebDriver";
    private static final String ANOTHER_USER_AGENT = "AnotherUserAgent";
    private static final Long ANOTHER_PAGE_LOAD_TIMEOUT = 2L;
    private static final Long ANOTHER_IMPLICITLY_WAIT = 20L;
    private static final String WEB_DRIVER_EXECUTABLE = "webDriver";
    private static final String USER_AGENT = "userAgent";
    private static final Long PAGE_LOAD_TIMEOUT = 1L;
    private static final Long IMPLICITLY_WAIT = 10L;

    private WebDriverConfig webDriverConfig;


    @BeforeEach
    public void setup() {
        webDriverConfig = new WebDriverConfig(WEB_DRIVER_EXECUTABLE, USER_AGENT,
                PAGE_LOAD_TIMEOUT, IMPLICITLY_WAIT);
    }

    @DisplayName("JUnit test for WebDriverConfig state")
    @Test
    public void shouldReturnSuccessIfCorrectState() {
        assertEquals(webDriverConfig.getWebDriverExecutable(), WEB_DRIVER_EXECUTABLE);
        assertEquals(webDriverConfig.getUserAgent(), USER_AGENT);
        assertEquals(webDriverConfig.getImplicitlyWait(), IMPLICITLY_WAIT);
        assertEquals(webDriverConfig.getPageLoadTimeout(), PAGE_LOAD_TIMEOUT);
    }

    @DisplayName("JUnit test for two objects with same state")
    @Test
    public void shouldReturnSuccessIfTwoObjectsWithSameValuesEquals() {
        assertEquals(webDriverConfig,
                new WebDriverConfig(WEB_DRIVER_EXECUTABLE, USER_AGENT, PAGE_LOAD_TIMEOUT, IMPLICITLY_WAIT));
    }

    @DisplayName("JUnit test for two objects with different values of field")
    @Test
    public void shouldReturnSuccessIfTwoObjectsWithDifferentValuesNotEquals() {
        assertNotEquals(webDriverConfig, new WebDriverConfig(ANOTHER_WEB_DRIVER_EXECUTABLE,
                USER_AGENT, PAGE_LOAD_TIMEOUT, IMPLICITLY_WAIT));
        assertNotEquals(webDriverConfig, new WebDriverConfig(WEB_DRIVER_EXECUTABLE,
                ANOTHER_USER_AGENT, PAGE_LOAD_TIMEOUT, IMPLICITLY_WAIT));
        assertNotEquals(webDriverConfig, new WebDriverConfig(WEB_DRIVER_EXECUTABLE,
                USER_AGENT, ANOTHER_PAGE_LOAD_TIMEOUT, IMPLICITLY_WAIT));
        assertNotEquals(webDriverConfig, new WebDriverConfig(WEB_DRIVER_EXECUTABLE,
                USER_AGENT, PAGE_LOAD_TIMEOUT, ANOTHER_IMPLICITLY_WAIT));
    }

}
