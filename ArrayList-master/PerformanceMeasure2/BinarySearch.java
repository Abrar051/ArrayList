package PerformanceMeasure2;
import java.util.*;
public class BinarySearch implements Search {
    public int[] array = new int[20];
    public int searchItem;
    private int swapStep=0;
    BinarySearch (int number , int[]array)
    {
        this.array=array;
        this.searchItem=number;
    }
    @Override
    public void search(int number) {
        swap();
        binarySearch(this.array,number);
    }

    public int swap ()
    {
        int n = this.array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (this.array[j] > this.array[j+1])
                {
                    //swap
                    int temp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = temp;
                    swapStep++;
                }
        return swapStep;
    }
    public void printSwapStep ()
    {
        System.out.println("Process step took : "+this.swapStep+" steps");
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


}
