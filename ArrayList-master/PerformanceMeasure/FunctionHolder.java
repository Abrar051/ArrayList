package PerformanceMeasure;
import java.util.*;
public class FunctionHolder implements BinarySort,NormalSort{
    private int[] array = new int[5];
    Scanner input = new Scanner(System.in);
    public void takeInput ()
    {
        for (int i=0;i<5;i++)
        {
            this.array[i]=input.nextInt();
        }
    }
    @Override
    public int BinarySort(int number) {
        //at first sort then search
        swap();
        long time = System.nanoTime();
        binarySearch(this.array,this.array[0],this.array[4],3);
        long newTime = System.nanoTime()-time;
        return (int) newTime;
    }
    public static void binarySearch (int[]arr , int first , int last , int searchItem)
    {
        int middle = (first + last) / 2;
        if ((last - first) == 1) {
            if (arr[first] == searchItem) {
                System.out.println("Normal sort match found");
            } else if (arr[last] == searchItem) {
                System.out.println("Normal sort match found");
            }
            return;
        }
        if (arr[middle] == searchItem) {
            System.out.println("Normal sort match found");

            return;
        }
        if (searchItem > arr[middle])
            binarySearch(arr, middle, last, searchItem);
        else
            binarySearch(arr, first, middle, searchItem);
    }
    public void swap ()
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    public void printData ()
    {
        System.out.println(Arrays.toString(this.array));
    }
    @Override
    public int NormalSort(int number) {
        long time = System.nanoTime();
        for (int i=0;i<5;i++)
        {
            if (this.array[i]==number)
            {
                System.out.println("Normal sort match found");
            }
        }
        long newTime = System.nanoTime()-time;
        return (int) newTime;
    }
    public void compare (int normal , int binary)
    {
        if (normal>binary)
        {
            System.out.println("Normal sort took time");
        }
        else if (normal==binary)
        {
            System.out.println("Both took same time");
        }
        else
        {
            System.out.println("Binary took more time");
        }
    }
}
