package Design_Pattern.Facad.Amazone;

public class Amazone {
    private InventryManagementSystemHelper imsHelper;
    private  NotificationManagementSystemHelper nmsHelper;
    private OrderPlacedManagementSystemHelper opmHelper;

    public Amazone() {
        this.imsHelper = new InventryManagementSystemHelper();
        this.nmsHelper = new NotificationManagementSystemHelper();
        this.opmHelper = new OrderPlacedManagementSystemHelper();
    }

    public void OrderPlaced(){
         imsHelper.CheckandUpdateInventry();
         nmsHelper.DoNotificationUpdate();
         opmHelper.UpdatePlacedOrder();
     }
}
