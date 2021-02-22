package PerformanceMeasure;

public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        obj.takeInput();
        //obj.printData();
        ThreadDemo t1 = new ThreadDemo("Normal",3);
        ThreadDemo t2 = new ThreadDemo("Binary",3);
        obj.compare(t1.getTime(),t2.getTime());
    }
}
