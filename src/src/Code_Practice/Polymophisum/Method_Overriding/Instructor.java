package Code_Practice.Polymophisum.Method_Overriding;

public class Instructor extends User implements Runnable{
    public String CurrentBatch;
    @Override
    public void userDetail(){
        System.out.println("Instructor Name-"+ name + ",Instructor Email-" + email +",Current Batch Name-"+CurrentBatch);

    }
    public void run(){
        System.out.println("Instructor is current batch is " +CurrentBatch);
        System.out.println("Instructor is current Topic is LLD-3");
    }

    public Instructor(String name,String email,String currentBatch ){
        super(name,email);
        CurrentBatch = currentBatch;
    }


}
