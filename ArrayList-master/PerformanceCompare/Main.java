package PerformanceCompare;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[500];
        ArrayMaker obj = new ArrayMaker();
        NormalSearch num = new NormalSearch();
        BinarySearch num1 = new BinarySearch();
        array=obj.formArray();
        obj.printArray();
        System.out.println("\nEnter number to search : ");
        int number = input.nextInt();
        //num.search(number,array);
        //num1.search(number,array);
        ThreadClass t = new ThreadClass(array,number);
        t.compare.start();
        t.interrupt();
    }
}
