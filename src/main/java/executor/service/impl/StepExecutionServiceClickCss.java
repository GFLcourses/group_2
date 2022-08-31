package executor.service.impl;

import executor.model.Step;
import executor.service.StepExecutionService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepExecutionServiceClickCss implements StepExecutionService {
    private static volatile StepExecutionServiceClickCss INSTANCE;

    private StepExecutionServiceClickCss() {
    }

    ;

    public static StepExecutionServiceClickCss getInstance() {
        if (INSTANCE == null) {
            synchronized (StepExecutionServiceClickCss.class) {
                if (INSTANCE == null) {
                    INSTANCE = new StepExecutionServiceClickCss();
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public String getStepAction() {
        return "ClickCss";
    }

    @Override
    public void step(WebDriver webDriver, Step step) {
        if (webDriver == null || step == null) {
            return;
        }
        try {
            WebElement webElement = webDriver.findElement(By.cssSelector(step.getValue()));
            if (webElement.isEnabled()) {
                webElement.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

