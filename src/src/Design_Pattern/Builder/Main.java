package Design_Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder().Id(1)
                .Age(20)
                .Email("Bhushan13Nile@gmail.com")
                .Name("Bhushan Nile")
                .PhoneNumber("7709866513")
                .GradYear(2028)
                .Psp(0)
                .UniversityName("BAMU")
                .build();
        System.out.println(s);
    }
}
