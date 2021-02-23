package PerformanceCompare;

import java.util.Scanner;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[500];
        ArrayMaker obj = new ArrayMaker();
        ThreadClass timeCompare = new ThreadClass();
        array=obj.formArray();
        obj.printArray();
        System.out.println("\nEnter number to search : ");
        int number = input.nextInt();
        NormalSearch num = new NormalSearch(number,array);
        BinarySearch num1 = new BinarySearch(number,array);
        Thread t1 = new Thread (num);
        Thread t2 = new Thread (num1);
        obj.compare(timeCompare.getTime(t1), timeCompare.getTime(t2));
    }
}
