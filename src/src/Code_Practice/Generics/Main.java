package Code_Practice.Generics;

public class Main {
    public static void main(String[] args) {
        Holder<String,String,Integer> studernt = new Holder<>();
        studernt.first ="Bhushan Nile";
        studernt.second ="bhushan13nile@gmail.com";
        studernt.third = 93091907;
        studernt.toString();
        System.out.println(studernt.toString());
    }
}
