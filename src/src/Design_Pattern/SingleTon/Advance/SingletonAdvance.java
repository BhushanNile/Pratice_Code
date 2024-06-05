package Design_Pattern.SingleTon.Advance;

public class SingletonAdvance {
         private static SingletonAdvance instacneADV;

    private SingletonAdvance() {
    }
    public static SingletonAdvance getInstacneADV(){
        if(instacneADV== null){
             if(instacneADV == null){
                    instacneADV = new SingletonAdvance();
                }
            }

        return instacneADV;
    }
}
