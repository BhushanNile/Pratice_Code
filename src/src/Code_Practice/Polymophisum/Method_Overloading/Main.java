package Code_Practice.Polymophisum.Method_Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,15);
        c.add(15.32,25);
        c.add(85,85.325);
        c.add("1652","656");
    }
}
