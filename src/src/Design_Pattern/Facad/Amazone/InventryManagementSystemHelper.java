package Design_Pattern.Facad.Amazone;

import java.util.Random;

public class InventryManagementSystemHelper {

    public void CheckandUpdateInventry(){
        CheckCurrentCout();
        StockUpdate();

    }

    public void CheckCurrentCout(){
        Random random = new Random();
        int  count = random.nextInt();

        System.out.println("Current Count of Stock Product is :- " + count);
    }

    public void StockUpdate(){
        System.out.println("Stock is update and product is present");
    }

}
