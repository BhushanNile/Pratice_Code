package Code_Practice.Generics;

public class Holder <A,B,C>{
    A first;
    B second;
    C third;

    @Override
    public String toString() {
        return "Holder{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
