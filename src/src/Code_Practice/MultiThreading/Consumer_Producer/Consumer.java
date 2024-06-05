package Code_Practice.MultiThreading.Consumer_Producer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    public Queue<shirt> store;
    private String name;
    private int maxsize;
    private Semaphore semaConsumer;
    private Semaphore semaProducer;

    public Consumer(Queue<shirt> store, String name, Semaphore semaConsumer, Semaphore semaProducer) {
        this.store = store;
        this.name = name;
        this.maxsize = 5;
        this.semaConsumer = semaConsumer;
        this.semaProducer = semaProducer;
    }
    public void run(){
        while(true) {
            try {
                semaConsumer.acquire();
                System.out.println("Current size -" + maxsize + ", Name of Consumer -" + name);
                store.remove();
                semaProducer.release();
            }  catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
