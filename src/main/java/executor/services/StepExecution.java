package executor.services;

import executor.model.Step;
import org.openqa.selenium.WebDriver;

public interface StepExecution {
    public String getStepAction();
    public void step(WebDriver webDriver, Step step);
}
