package PerformanceCompare;
import java.util.*;

import static java.lang.Math.abs;

public class ArrayMaker {
    Random rand = new Random();
    int[] array = new int[500];
    int maximum = 500;
    int minimum = 1;
    public int[] formArray ()
    {
        int n = maximum - minimum + 1;
        for (int i=0;i<array.length;i++)
        {
            int random = rand.nextInt() % n;
            int randomNum =  minimum + random;
            this.array[i]= abs(randomNum);
        }
        return this.array;
    }
    public void printArray (int[] array)
    {
        System.out.print(" [ ");
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.print(" ] ");
    }
    public void compare (long normal , long binary)
    {
        System.out.println("Normal search took time "+normal+ " nanoseconds");
        System.out.println("Binary search took time "+binary+ " nanoseconds");
        if (normal>binary)
        {
            System.out.println("Normal sort took more time");
            return;
        }
        else if (normal==binary)
        {
            System.out.println("Both took same time");
            return;
        }
        else if (normal<binary)
        {
            System.out.println("Binary took more time");
            return;
        }
    }
    public int[] getArray() {
        return this.array;
    }
}
