package executor.service;

import executor.service.model.ThreadPoolConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class ApplicationTest
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true );
    }

    @Test
    public void ThreadPoolConfigTest(){
         ThreadPoolConfig th1 = new ThreadPoolConfig(10, 1_000_000_000L);
         ThreadPoolConfig th2 = new ThreadPoolConfig(10, 1_000_000_000L);
        assertEquals(th1, th2);
        th1.setCorePoolSize(th1.getCorePoolSize()*2);
        th1.setKeepAliveTime(th1.getKeepAliveTime()*2);
        ThreadPoolConfig actual = new ThreadPoolConfig(20, 2_000_000_000L);
        assertEquals(actual,th1);
    }
}
