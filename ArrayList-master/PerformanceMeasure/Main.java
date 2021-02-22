package PerformanceMeasure;

public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        obj.takeInput();
        //obj.printData();
        ThreadDemo t1 = new ThreadDemo("Normal",3);
        ThreadDemo t2 = new ThreadDemo("Binary",3);
        t1.start();
        t1.t.interrupt();
        t2.start();
        t2.t.interrupt();
        System.out.println(t1.getTime());
        System.out.println(t2.getTime());
        obj.compare(t1.getTime(),t2.getTime());
    }
}
