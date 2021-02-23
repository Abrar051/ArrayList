package PerformanceMeasure2;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        RandomArrayMaker obj = new RandomArrayMaker();
        array=obj.formArray();
        obj.printArray();
        System.out.println("\nEnter number to search : ");
        int num = input.nextInt();
        ThreadDemo t1 = new ThreadDemo(array,num,"Binary");
        ThreadDemo t2 = new ThreadDemo(array,num,"Normal");
        obj.compare(t1.getTime(), t2.getTime());
    }
}
