package Code_Practice.MultiThreading.Consumer_Producer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Substractor implements Runnable{
    public Queue<shirt> store;
    private String name;
    private int maxsize;
    private Semaphore semaConsumer;
    private Semaphore semaProducer;

    public Substractor(Queue<shirt> store, String name, int maxsize, Semaphore semaConsumer, Semaphore semaProducer) {
        this.store = store;
        this.name = name;
        this.maxsize = maxsize;
        this.semaConsumer = semaConsumer;
        this.semaProducer = semaProducer;
    }
    public void run() {
        while (true) {
            try {
                semaProducer.acquire();
                System.out.println("Current size -" + maxsize + ", Current producer name - " + name);
                store.add(new shirt());
                semaConsumer.release();
            }catch ( Exception e)
            {
                e.getMessage();
            }

        }
    }
}
