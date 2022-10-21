package executor.facade.impl;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ParallelFlowExecuteServiceTest {

    @Test
    public void parallelTest() {

        ParallelFlowExecuteService parallelFlowExecuteService = mock(ParallelFlowExecuteService.class);
        verify(parallelFlowExecuteService,times(2));
    }
}
