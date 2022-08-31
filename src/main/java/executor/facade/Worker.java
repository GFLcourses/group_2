package executor.facade;

import org.apache.log4j.Logger;

public class Worker implements Runnable {
    final static Logger logger = Logger.getLogger(Worker.class);

    private int test;
    public Worker(int test) {
        //something
        this.test = test;
    }

    public int getTest() {
        return test;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test++;
        logger.info(test + " Worker start work\n");
        //does something
    }
}