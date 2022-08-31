package executor.facade;

import executor.util.Property;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ParalleFlowExecutorService {
    private int countOfTask;



    public void director(){
        int corePoolSize = Integer.parseInt(Property.getProperty("ThreadPoolConfig.corePoolSize"));
        long keepAliveTime = Long.parseLong(Property.getProperty("ThreadPoolConfig.keepAliveTime"));
        BlockingQueue<Runnable> blockingQueue =
                new LinkedBlockingQueue<Runnable>();


        ThreadPool executor =
                new ThreadPool(corePoolSize, 20, keepAliveTime, TimeUnit.SECONDS,
                        blockingQueue, new ThreadPoolExecutor.AbortPolicy());

        // Let start all core threads initially
        executor.prestartAllCoreThreads();


        for (int i = 0; i <= 100; i++) {
            blockingQueue.offer(new Worker(i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}