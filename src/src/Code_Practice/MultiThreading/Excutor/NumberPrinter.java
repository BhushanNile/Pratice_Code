package Code_Practice.MultiThreading.Excutor;

public class NumberPrinter implements Runnable{
    private int i;

    public NumberPrinter(int Number) {
         i = Number;
    }
    public void run(){
        System.out.println("Current Number:- "+i+ ", Current Thread Name:-"+Thread.currentThread().getName()+",Time"
        +System.currentTimeMillis());
    }
}
