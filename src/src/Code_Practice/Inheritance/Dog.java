package Code_Practice.Inheritance;

public class Dog extends Animal {
    private String fur_colour;
    public Dog(int Noleg, String colour, String name,String fur_colour) {
        super(Noleg,colour,name);
        this.fur_colour = fur_colour;
    }
    @Override
    public void printdetail(){
        System.out.println("printing the method form dog class");

    }
}
