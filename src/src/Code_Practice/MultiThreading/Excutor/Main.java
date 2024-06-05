package Code_Practice.MultiThreading.Excutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i=0; i<100;i++)
        {
            NumberPrinter np = new NumberPrinter(i);
            executor.submit(np);
        }
    }
}
