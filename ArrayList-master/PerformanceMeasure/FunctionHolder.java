package PerformanceMeasure;
import java.util.*;
public class FunctionHolder implements BinarySearch,NormalSearch {
    private int[] array = new int[5];
    public long runTime;
    Scanner input = new Scanner(System.in);
    public void takeInput ()
    {
        System.out.println("Enter 5 elements : ");
        for (int i=0;i<5;i++)
        {
            this.array[i]=input.nextInt();
        }
    }
    public long BinarySearch(int number) {
        //at first sort then search
        long time = System.nanoTime();
        swap();
        binarySearch(this.array,number);
        long newTime = System.nanoTime()-time;
        return newTime;
    }

    @Override
    public long search(String type, int number) {
        if (type.equals("Normal"))
            this.runTime = NormalSearch(number);
        else if (type.equals("Binary"))
            this.runTime = BinarySearch(number);

        return this.runTime;
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

    public long NormalSearch(int number) {
        long time = System.nanoTime();
        for (int i=0;i<5;i++)
        {
            if (this.array[i]==number)
            {
                System.out.println("Normal sort match found");
            }
        }
        long newTime = System.nanoTime()-time;
        return newTime;
    }
    public void compare (long normal , long binary)
    {
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
