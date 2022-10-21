package executor.facade.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import executor.model.Scenario;
import executor.service.impl.ProxySourcesClientService;
import executor.service.impl.ScenarioSourceListenerService;

import java.util.Queue;

public class Worker implements Runnable {

    private ScenarioSourceListenerService scenarioSourceListenerService;
    private Queue<Scenario> scenarios;
    private ProxySourcesClientService proxySourcesClientService;

    public Worker(ScenarioSourceListenerService scenarioSourceListenerService, Queue<Scenario> scenarios, ProxySourcesClientService proxySourcesClientService) {
        this.scenarioSourceListenerService = scenarioSourceListenerService;
        this.scenarios = scenarios;
        this.proxySourcesClientService = proxySourcesClientService;
    }

    @Override
    public void run() {


        scenarios = scenarioSourceListenerService.execute();
        for (int i = 0; i < scenarios.size() + 1; i++) {
            scenarios.peek().getName();
            scenarios.peek().getSite();
            scenarios.poll();
            proxySourcesClientService.getProxy().getProxyNetworkConfig();
            proxySourcesClientService.getProxy().getProxyCredentials();
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "scenarioSourceListenerService=" + scenarioSourceListenerService +
                ", scenarios=" + scenarios +
                ", proxySourcesClientService=" + proxySourcesClientService +
                '}';
    }
}
