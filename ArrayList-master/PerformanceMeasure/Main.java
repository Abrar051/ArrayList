package PerformanceMeasure;

public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        obj.takeInput();
        obj.compare(obj.NormalSort(3),obj.BinarySort(3));
        obj.printData();
    }
}
