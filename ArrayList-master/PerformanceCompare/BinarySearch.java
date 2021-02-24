package PerformanceCompare;
import java.util.*;
public class BinarySearch implements Search{
    public int number;
    public int[] array;
    BinarySearch (int number , int[] array)
    {
        this.number=number;
        this.array=array;
    }
    @Override
    public void search(int num , int[] array) {
        binarySearch(num, swap(array));
    }
    public static boolean binarySearch(int value , int[] array)  {
        int start = 0;
        int end = array.length -1;

        for (int i = 0; i < array.length; i++)   {
            int middle = (end - start)/2;
            if (array[i] == value)  {
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

    public int[] swap (int[] array)
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
        return array;
    }


    public void run() {
        search(this.number,this.array);
    }
}
