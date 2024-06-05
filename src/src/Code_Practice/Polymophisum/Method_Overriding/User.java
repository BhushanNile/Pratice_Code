package Code_Practice.Polymophisum.Method_Overriding;

public abstract class User {
   public String name;
   public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void userDetail();
}
