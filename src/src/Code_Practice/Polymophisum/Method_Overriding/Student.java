package Code_Practice.Polymophisum.Method_Overriding;

public class Student extends User{
  public int psp;
  public int Attendance;
   @Override
    public void userDetail(){
       System.out.println("Name of Student-"+name+",Email of Student-"+email+", PSP of Student -"+psp+",Attendnce of Student-"+
               Attendance);
      }

    public Student(String name, String email, int psp, int attendance) {
        super(name, email);
        this.psp = psp;
        Attendance = attendance;
    }
}
