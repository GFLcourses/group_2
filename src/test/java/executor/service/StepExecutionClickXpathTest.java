package executor.service;

import executor.model.Step;
import executor.service.impl.StepExecutionClickXpath;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class StepExecutionClickXpathTest {

    @Test
    void testGetStepAction() {
        Step step = new Step("clickXpath", "value");
        StepExecutionClickXpath stepExecutionClickXpath = StepExecutionClickXpath.getInstance();
        assertEquals("Step action is wrong", stepExecutionClickXpath.getStepAction(), "clickXpath");
    }

    @Test
    public void testStepClickXpath() {
        StepExecutionClickXpath stepExecutionClickXpath = StepExecutionClickXpath.getInstance();
        WebDriver webDriver = mock(WebDriver.class);
        Step step = new Step("clickXpath","/html/body/p");
        stepExecutionClickXpath.step(webDriver,step);
        verify(webDriver, times(1)).
                findElement(By.xpath(step.getValue()));
    }


}
