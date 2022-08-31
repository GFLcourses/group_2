package executor.service;

import executor.model.Step;
import executor.service.impl.StepExecutionServiceClickCss;
import executor.service.impl.WebDriverChromeService;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.mockito.Mockito.*;

public class StepExecutionServiceClickCssTest {
     @Test
    public void ClickCssTest() {
         StepExecutionServiceClickCss stepExecutionClickCss = StepExecutionServiceClickCss.getInstance();
         WebDriver webDriver = mock(WebDriver.class);
         Step step = new Step("clickCss","body > ul > li:nth-child(1) > a");
        stepExecutionClickCss.step(webDriver, step);
        verify(webDriver, times(1)).
                findElement(By.cssSelector(step.getValue()));
    }
}
