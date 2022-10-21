package executor.facade.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import executor.facade.ExecutionService;
import executor.model.Scenario;
import executor.service.ExecutorService;
import executor.service.ScenarioSourceListener;
import executor.service.impl.ProxySourcesClientService;
import executor.service.impl.ScenarioExecutorService;
import executor.service.impl.ScenarioSourceListenerService;
import executor.util.ObjectMapperUtil;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.Queue;

import static org.mockito.Mockito.*;

public class ParallelFlowExecuteServiceTest {

    @After
    public void validate() {
        validateMockitoUsage();
    }
    @Test
    public void parallelTest() {

        ScenarioSourceListenerService scenarioService = new ScenarioSourceListenerService(new ObjectMapperUtil());
        Queue<Scenario> scenarios = scenarioService.execute();

        ProxySourcesClientService proxy = new ProxySourcesClientService(new ObjectMapper());
        ParallelFlowExecuteService parallelFlowExecuteService = mock(ParallelFlowExecuteService.class);
        parallelFlowExecuteService.parallelExecute(new Worker(scenarioService,scenarios,proxy));
        verify(parallelFlowExecuteService,times(2).description(" "));
    }
}
