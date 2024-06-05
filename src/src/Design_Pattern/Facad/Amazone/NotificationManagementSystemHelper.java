package Design_Pattern.Facad.Amazone;

public class NotificationManagementSystemHelper {


    public void DoNotificationUpdate(){
       NotificationBySMS();
        NotificationByEMAIL();

    }
    public void NotificationBySMS(){
        System.out.println("SMS send to Customer for Product update  ");
    }
    public  void NotificationByEMAIL(){
        System.out.println("EMAIL send to Customer for Product update");
    }
}
