package executor.facade;

import org.apache.log4j.Logger;

public class Worker implements Runnable {
    final static Logger logger = Logger.getLogger(Worker.class);

    private String test;
    public Worker(String test) {
        //something
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(test + " Worker start work\n");
        //does something
    }
}

