package Code_Practice.MultiThreading.Adder__Sbustracter;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        count c = new count(10);
//        ReentrantLock mutex = new ReentrantLock();

//        Adder adder = new Adder(c,mutex);
//        Thread adderThread = new Thread(adder);

//        Substractor substractor = new Substractor(c,mutex)

        Adder adderc = new Adder(c);
        Substractor sub = new Substractor(c);

        Thread adderco = new Thread(adderc);
        Thread subco = new Thread(sub);
        adderco.start();
        subco.start();

        System.out.println(c.getC());
    }
}
