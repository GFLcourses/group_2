package executor.service;

import executor.facade.ParalleFlowExecutorService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ParalleFlowExecutorServiceTest {
    @Test
    public void PoolTest() {


       ParalleFlowExecutorService service = mock(ParalleFlowExecutorService.class);
       service.director();

        verify(service, times(100));
   }
}
