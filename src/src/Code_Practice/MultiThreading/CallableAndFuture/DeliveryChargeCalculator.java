package Code_Practice.MultiThreading.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class DeliveryChargeCalculator implements Callable {
    @Override
    public Integer call()throws Exception {
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Delivery Charge:-" + i + "Thread used :-" + Thread.currentThread().getName());
        return i;


    }

}
