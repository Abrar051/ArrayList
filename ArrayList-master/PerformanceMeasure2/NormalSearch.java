package PerformanceMeasure2;
import java.util.*;
public class NormalSearch implements Search {
    public int[] array = new int[20];
    public int searchItem;
    private int length=0;
    NormalSearch (int number , int[]array)
    {
        this.array=array;
        this.searchItem=number;
    }
    @Override
    public void search(int number) {
        int step = 0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==number)
            {
                System.out.println("Normal search match found");
                step=i+1;
                break;
            }
        }
        this.length=step;
    }
    public int getSearchItem ()
    {
        return this.length;
    }
}
