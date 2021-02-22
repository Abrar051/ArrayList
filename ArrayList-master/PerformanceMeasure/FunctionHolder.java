package PerformanceMeasure;
import java.util.*;
public class FunctionHolder implements BinarySearch,NormalSearch {
    private int[] array = new int[5];
    Scanner input = new Scanner(System.in);
    public void takeInput ()
    {
        System.out.println("Enter 5 elements : ");
        for (int i=0;i<5;i++)
        {
            this.array[i]=input.nextInt();
        }
    }
    public int BinarySearch(int number) {
        //at first sort then search
        long time = System.nanoTime();
        swap();
        binarySearch(this.array,this.array[0],this.array[4],3);
        long newTime = System.nanoTime()-time;
        return (int) newTime;
    }

    @Override
    public void search(String type, int number) {
        if (type.equals("Normal"))
        {
            NormalSearch(number);
        }
        else if (type.equals("Binary"))
        {
            BinarySearch(number);
        }
    }

    public static void binarySearch (int[]array , int first , int last , int searchItem)
    {
        int middle = (first + last) / 2;
        if ((last - first) == 1) {
            if (array[first] == searchItem) {
                System.out.println("Binary sort match found");
            } else if (array[last] == searchItem) {
                System.out.println("Binary sort match found");
            }
            return;
        }
        if (array[middle] == searchItem) {
            System.out.println("Binary sort match found");
            return;
        }
        if (searchItem > array[middle])
        {
            binarySearch(array, middle, last, searchItem);
        }
        else
        {
            binarySearch(array, middle, last, searchItem);
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

    public int NormalSearch(int number) {
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
            System.out.println("Normal sort took more time");
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
