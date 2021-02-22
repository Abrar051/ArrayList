package PerformanceMeasure2;
import java.util.*;
public class NormalSearch implements Search {
    public int[] array = new int[10];
    public int searchItem;
    NormalSearch (int number , int[]array)
    {
        this.array=array;
        this.searchItem=number;
    }
    @Override
    public void search(int number) {
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==number)
            {
                System.out.println("Normal search match found");
                break;
            }
        }
        System.out.println(Arrays.toString(this.array));
    }
}
