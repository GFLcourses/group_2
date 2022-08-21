package executor.facade;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ParalleFlowExecutorService {

    public void director(){
       BlockingQueue<Runnable> blockingQueue =
                new LinkedBlockingQueue<Runnable>();

        ThreadPool executor =
                new ThreadPool(10, 20, 5, TimeUnit.SECONDS,
                        blockingQueue, new ThreadPoolExecutor.AbortPolicy());

        // Let start all core threads initially
        executor.prestartAllCoreThreads();

        for (int i = 1; i <= 100; i++) {
            blockingQueue.offer(new Worker("Test " + i));
        }

        executor.shutdown();
       try {
           executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

}


