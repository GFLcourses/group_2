package executor.service.StepExecution;

import executor.service.model.Step;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepExecutionSleep implements StepExecution {

    @Override
    public String getStepAction() {
        return "sleep";
    }

    @Override
    public void step(WebDriver webDriver, Step step) {
        try {
            TimeUnit.SECONDS.sleep(Long.parseLong(step.getValue()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
