package PerformanceCompare;

public class BinarySearch implements Search{
    @Override
    public void search(int num , int[] array) {
        swap(array);
        binarySearch(num, array);
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
    public void swap (int[] array)
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
    public long getBinaryTime (int num,int[] array)
    {
        long time = System.nanoTime();
        search(num, array);
        long newTime = System.nanoTime()-time;
        return newTime;
    }
}
