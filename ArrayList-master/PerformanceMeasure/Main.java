package PerformanceMeasure;

public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        obj.takeInput();
        obj.compare(obj.NormalSearch(3),obj.BinarySearch(3));
        obj.printData();
    }
}
