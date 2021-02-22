package PerformanceMeasure;

public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        obj.takeInput();
        //obj.printData();
        ThreadDemo t1 = new ThreadDemo("Normal",8);
        ThreadDemo t2 = new ThreadDemo("Binary",8);
        obj.compare(t1.getTime(),t2.getTime());
    }
}
