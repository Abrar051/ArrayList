package PerformanceMeasure2;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        RandomArrayMaker obj = new RandomArrayMaker();
        obj.formArray();
        obj.printArray();
        array= obj.getArray();
        System.out.println("Enter number to search : ");
        int num = input.nextInt();
        BinarySearch obj1 = new BinarySearch(num , array);
        obj1.swap();
    }
}
