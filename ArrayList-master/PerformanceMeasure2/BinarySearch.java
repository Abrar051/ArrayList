package PerformanceMeasure2;
import java.util.*;
public class BinarySearch implements Search {
    public int[] array = new int[10];
    public int searchItem;
    BinarySearch (int number , int[]array)
    {
        this.array=array;
        this.searchItem=number;
    }
    @Override
    public void search(int number) {
        swap();
        binarySearch(this.array,this.array[0],this.array[array.length-1],number);
        System.out.println(Arrays.toString(this.array));
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
        System.out.println(Arrays.toString(this.array));
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

}
