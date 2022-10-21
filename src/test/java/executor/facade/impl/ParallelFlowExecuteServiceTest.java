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
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;

import java.util.Queue;

import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class ParallelFlowExecuteServiceTest {
    @Test
    public void parallelTest() {

        ProxySourcesClientService proxySourcesClientService = new ProxySourcesClientService(new ObjectMapper());
        ScenarioSourceListenerService scenarioSourceListenerService = new ScenarioSourceListenerService(new ObjectMapperUtil());
        Queue<Scenario> scenarios = scenarioSourceListenerService.execute();


        ParallelFlowExecuteService parallelFlowExecuteService = new ParallelFlowExecuteService();
        parallelFlowExecuteService.parallelExecute(new Worker(scenarioSourceListenerService,scenarios,proxySourcesClientService));
        ParallelFlowExecuteService parallel = mock(ParallelFlowExecuteService.class);
        parallel.parallelExecute(new Worker(scenarioSourceListenerService,scenarios,proxySourcesClientService));
        Mockito.verify(parallel,times(2)).parallelExecute(new Worker(scenarioSourceListenerService,scenarios,proxySourcesClientService));
    }
}
