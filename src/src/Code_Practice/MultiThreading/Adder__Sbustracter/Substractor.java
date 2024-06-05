package Code_Practice.MultiThreading.Adder__Sbustracter;

import java.util.concurrent.locks.ReentrantLock;

public class Substractor implements Runnable{
    public count cou;
  //  public ReentrantLock mutex;

    public Substractor(count cou) {
        this.cou = cou;
    }
//    public Substractor(count cou, ReentrantLock mutex) {
//        this.cou = cou;
//        this.mutex = mutex;
//    }
    @Override
    public void run(){
        for(int i=1; i<=10000; i++)
        {
            cou.setC(cou.getC()-1);
        }
    }


}
