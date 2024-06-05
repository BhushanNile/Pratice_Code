package Code_Practice.Inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal(4,"white","Rahul");
        a.printdetail();
        Dog d = new Dog(4,"Black", "Rushikesh","Dark Black");
        d.printdetail();
    }
}