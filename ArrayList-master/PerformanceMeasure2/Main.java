package PerformanceMeasure2;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[20];
        RandomArrayMaker obj = new RandomArrayMaker();
        array=obj.formArray();
        obj.printArray();
        System.out.println("\nEnter number to search : ");
        int num = input.nextInt();
        Process obj1 = new Process(array,num);
        obj.compare(obj1.getNormalTime(), obj1.getBinaryTime());
        obj1.processStepNormal();
        obj1.getBinarySwapTime();
    }
}
