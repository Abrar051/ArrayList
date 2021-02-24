package PerformanceCompare;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[500];
        int[] tempArray;
        ArrayMaker obj = new ArrayMaker();
        ThreadClass timeCompare = new ThreadClass();
        array=obj.formArray();
        tempArray=array;
        obj.printArray(array);
        System.out.println("\nEnter number to search : ");
        int number = input.nextInt();
        NormalSearch num = new NormalSearch(number,array);
        BinarySearch num1 = new BinarySearch(number,tempArray);
        Thread t1 = new Thread ((Runnable) num); //normal
        Thread t2 = new Thread ((Runnable) num1);//binary
        obj.compare(timeCompare.getTime(t1), timeCompare.getTime(t2));
        System.out.println("Sorted list : ");
        obj.printArray(num1.swap(array));
    }
}
