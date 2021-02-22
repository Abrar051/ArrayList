package PerformanceMeasure;
import java.util.*;
public class FunctionHolder implements BinarySearch,NormalSearch {
    public int arraySize=10;
    private int[] array = new int[arraySize];
    public long runTime;
    Scanner input = new Scanner(System.in);
    public void takeInput ()
    {
        System.out.println("Enter "+this.array.length+" elements : ");
        for (int i=0;i< array.length;i++)
        {
            this.array[i]=input.nextInt();
        }
    }
    public void BinarySearch(int number) {
        //at first sort then search
        swap();
        binarySearch(this.array,number);
    }

    @Override
    public void search(String type, int number) {
        if (type.equals("Normal"))
            NormalSearch(number);
        else if (type.equals("Binary"))
            BinarySearch(number);

    }
    public static boolean binarySearch(int[] array, int value)  {
        int start = 0;
        int end = array.length -1;

        for (int i = 0; i < array.length; i++)   {
            int middle = (end - start)/2;
            if (array[i] == value)  {
                System.out.println("Binary search match found");
                return true;
            }
            else if (array[middle] > value)  {
                end = middle - 1;
            }
            else    {
                start = middle + 1;
            }
        }
        return false;
    }
    public static void binarySearch (int[]array , int first , int last , int searchItem)
    {
        int middle = (first + last) / 2;
        if ((last - first) == 1) {
            if (array[first] == searchItem) {
                System.out.println("Binary search match found");
            } else if (array[last] == searchItem) {
                System.out.println("Binary search match found");
            }
            return;
        }
        if (array[middle] == searchItem) {
            System.out.println("Binary search match found");
            return;
        }

        if (searchItem > array[middle])
        {
            binarySearch(array, middle, last, searchItem);
        }
        else if (searchItem<array[middle])
        {
            binarySearch(array, first, middle, searchItem);
        }
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

    public void NormalSearch(int number) {
        for (int i=0;i<array.length;i++)
        {
            if (this.array[i]==number)
            {
                System.out.println("Normal sort match found");
            }
        }
    }
    public void compare (long normal , long binary)
    {
        System.out.println("Normal search took time "+normal+ " milliseconds");
        System.out.println("Binary search took time "+binary+ " milliseconds");
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
        else
        {
            System.out.println("Binary took more time");
            return;
        }
    }
}
