package executor.service;

import executor.facade.ParalleFlowExecutorService;
import org.junit.jupiter.api.Test;

public class ParalleFlowExecutorServiceTest {
    @Test
    public void PoolTest() {
        ParalleFlowExecutorService service = new ParalleFlowExecutorService();
        service.director();
    }
}