package executor.service.impl;

import executor.util.Property;
import executor.service.WebDriverInitializerService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverChromeService implements WebDriverInitializerService {

    static {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
    }


    @Override
    public WebDriver create() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments();
        return new ChromeDriver();
    }
}
