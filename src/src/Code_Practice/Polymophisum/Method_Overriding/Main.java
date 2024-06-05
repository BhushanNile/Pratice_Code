package Code_Practice.Polymophisum.Method_Overriding;

public class Main {
    public static void main(String[] args) {
        User Instructor = new Instructor("Sandeep","sandeep@p.com","DEC-23");
        Student student = new Student("Bhushan","bhushan13nile@gmail.com",90,92);
        student.userDetail();
        System.out.println();
        Instructor.userDetail();
//        Instructor.run();
        System.out.println();
        Instructor Instructor1 = new Instructor("Manish","Manish.Pawar@y.com","DSA-NOV");
        Instructor1.run();
    }
}
