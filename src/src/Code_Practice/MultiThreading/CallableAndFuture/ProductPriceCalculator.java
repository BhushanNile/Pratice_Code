package Code_Practice.MultiThreading.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class ProductPriceCalculator implements Callable {
    @Override
    public Integer call() throws Exception{
        Random random =  new Random();
        Integer i = random.nextInt();
        System.out.println("Product Price:-" +i+"Thread used:-"+Thread.currentThread().getName());
        return i;
    }
}
