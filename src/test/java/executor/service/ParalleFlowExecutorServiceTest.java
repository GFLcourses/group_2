package executor.service;


import executor.facade.ParalleFlowExecutorService;
import executor.service.impl.StepExecutionServiceClickCss;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.mockito.Mockito.*;

public class ParalleFlowExecutorServiceTest {

   @Test
    public void PoolTest() {
        ParalleFlowExecutorService service = mock(ParalleFlowExecutorService.class);
        service.director();
        verify(service, times(100));

   }
}
