package executor.service;

import executor.StepExecution.Property;
import executor.StepExecution.WebDriverChrome;
import executor.StepExecution.WebDriverInitializer;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

     @Test
    public void TestChrome() {
     WebDriverInitializer chrome = new WebDriverChrome();
        WebDriver browser = chrome.create();

        browser.get("https://monkeylab.com.ua/");
        List<WebElement> webElements = browser.findElements(By.cssSelector("body > nav:nth-child(2) > div > div.navbar-collapse.offcanvas-nav > ul > li"));
        assertTrue(webElements.size() == 4);

    }

}
