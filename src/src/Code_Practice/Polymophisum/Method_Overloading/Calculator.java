package Code_Practice.Polymophisum.Method_Overloading;

public class Calculator {
    public void  add(int x, int y){
        System.out.println("sum -"+ x+y);
    }
    public void  add(int x, double y){
        System.out.println("sum -"+ x+y);
    }
    public void  add(double x, int y){
        System.out.println("sum -"+ x+y);
    }
    public void  add(double x, double y){
        System.out.println("sum -"+ x+y);
    }
    public void  add( String x, String y){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        System.out.println( (int)a +b);
    }
}
