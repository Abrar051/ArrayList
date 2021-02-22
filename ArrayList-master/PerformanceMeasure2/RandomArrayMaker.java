package PerformanceMeasure2;
import java.util.*;

import static java.lang.Math.abs;

public class RandomArrayMaker {
    Random rand = new Random();
    int[] array = new int[10];
    int maximum = 50;
    int minimum = 1;

    public void formArray ()
    {
        int n = maximum - minimum + 1;
        for (int i=0;i<10;i++)
        {
            int random = rand.nextInt() % n;
            int randomNum =  minimum + random;
            this.array[i]= abs(randomNum);
        }
    }
    public void printArray ()
    {
        System.out.print(" [ ");
        for (int i=0;i<10;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.print(" ] ");
    }

    public int[] getArray() {
        return this.array;
    }
}
