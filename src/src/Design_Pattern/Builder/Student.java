package Design_Pattern.Builder;

public class Student {
    private int id;
    private String Name;
    private String Email;
    private String UniversityName;
    private int psp;
    private int Age;
    private String PhoneNumber;
    private int GradYear;

    public Student(int id, String name, String email, String universityName, int psp, int age, String phoneNumber, int gradYear) {
        this.id = id;
        Name = name;
        Email = email;
        UniversityName = universityName;
        this.psp = psp;
        Age = age;
        PhoneNumber = phoneNumber;
        GradYear = gradYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", UniversityName='" + UniversityName + '\'' +
                ", psp=" + psp +
                ", Age=" + Age +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", GradYear=" + GradYear +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private int id;
        private String Name;
        private String Email;
        private String UniversityName;
        private int psp;
        private int age;
        private int Age;
        private String PhoneNumber;
        private int GradYear;

        public Builder GradYear(int gradYear) {
            GradYear = gradYear;
            return this;
        }

        public Builder Id(int id) {
            this.id = id;
            return this;
        }

        public Builder Name(String name) {
            Name = name;
            return this;
        }

        public Builder Email(String email) {
            Email = email;
            return this;
        }

        public Builder UniversityName(String universityName) {
            UniversityName = universityName;
            return this;
        }

        public Builder Psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder Age(int age) {
            this.age = age;
            return this;
        }

        public Builder PhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
            return this;
        }
        public void validate(){
            if(this.GradYear >2023 ){
                throw new GradYearInvalidException();
            }
            if(this.age <20 )
            {
                throw new InvalidAgeExcepetion();
            }
            if(this.Name == null)
            {
                throw new InvalidNmaeException();
            }
        }
        public Student build(){
            validate();
            return new Student(this.id, this.Name, this.Email, this.UniversityName, this.psp, this.Age,this.PhoneNumber,this.GradYear );
        }

    }
}
