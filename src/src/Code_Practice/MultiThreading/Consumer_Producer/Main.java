package Code_Practice.MultiThreading.Consumer_Producer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<shirt> store = new LinkedList<>();
        int maxsize= 5;
        Semaphore  semaConsumer = new Semaphore(0);
        Semaphore semaProducer = new Semaphore(5);

        Substractor sp1 = new Substractor(store,"sp1",maxsize,semaConsumer,semaProducer);
        Substractor sp2 = new Substractor(store,"sp2",maxsize,semaConsumer,semaProducer);
        Substractor sp3 = new Substractor(store,"sp3",maxsize,semaConsumer,semaProducer);
        Substractor sp4 = new Substractor(store,"sp4",maxsize,semaConsumer,semaProducer);
        Substractor sp5 = new Substractor(store,"sp5",maxsize,semaConsumer,semaProducer);

        Consumer c1 = new Consumer(store,"c1",semaConsumer,semaProducer);
        Consumer c2 = new Consumer(store,"c2",semaConsumer,semaProducer);
        Consumer c3 = new Consumer(store,"c3",semaConsumer,semaProducer);
        Consumer c4 = new Consumer(store,"c4",semaConsumer,semaProducer);
        Consumer c5 = new Consumer(store,"c5",semaConsumer,semaProducer);

        Thread tp1 =  new Thread(sp1);
        tp1.start();
        Thread tp2 =  new Thread(sp2);
        tp2.start();
        Thread tp3 =  new Thread(sp3);
        tp3.start();
        Thread tp4 =  new Thread(sp4);
        tp4.start();
        Thread tp5 =  new Thread(sp5);
        tp5.start();

        Thread tc1 = new Thread(c1);
        tc1.start();
        Thread tc2 = new Thread(c2);
        tc2.start();
        Thread tc3 = new Thread(c3);
        tc3.start();
        Thread tc4 = new Thread(c4);
        tc4.start();
        Thread tc5 = new Thread(c5);
        tc5.start();
    }
}
