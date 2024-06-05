package Code_Practice.MultiThreading.CallableAndFuture;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        DeliveryChargeCalculator deliveryPrice = new DeliveryChargeCalculator();
        ProductPriceCalculator productPrice = new ProductPriceCalculator();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> deliveryPriceFuture = executorService.submit(deliveryPrice);
        Future<Integer> priceOfProductFuture = executorService.submit(productPrice);

        try {
            Integer priceOfProduct = priceOfProductFuture.get();
            Integer PriceofDelivery = deliveryPriceFuture.get();
        }catch (Exception e){
//            throw new RuntimeException(e);
            System.out.println("Something went wrong");
        }
        }
    }

