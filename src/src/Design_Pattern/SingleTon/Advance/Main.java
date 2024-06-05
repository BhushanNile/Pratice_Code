package Design_Pattern.SingleTon.Advance;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {



//       ExecutorService executor = Executors.newFixedThreadPool(2);
//       for(int i=0; i<10; i++)
//       {
//           SingletonAdvance singletonAdvance = SingletonAdvance.getInstacneADV();
//           executor.submit(singletonAdvance);
//       }
//        Thread st1 = new Thread(String.valueOf(s1));
//        st1.start();
//        Thread st2 = new Thread(String.valueOf(s2));
//        st2.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                SingletonAdvance s1 = SingletonAdvance.getInstacneADV();
//
//            }
//        }).start();
        Runnable task = () -> {
            SingletonAdvance singleton = SingletonAdvance.getInstacneADV();

        };

        // Create and start multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("HELLO");






    }
}

