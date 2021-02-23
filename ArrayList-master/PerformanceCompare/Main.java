package PerformanceCompare;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[20];
        ArrayMaker obj = new ArrayMaker();
        NormalSearch num = new NormalSearch();
        BinarySearch num1 = new BinarySearch();
        array=obj.formArray();
        obj.printArray();
        System.out.println("\nEnter number to search : ");
        int number = input.nextInt();
        num.search(number,array);
        //num.getNormalIndex();
        num1.search(number,array);
        obj.compare(num.getNormalTime(number,array),num1.getBinaryTime(number,array));
    }
}
