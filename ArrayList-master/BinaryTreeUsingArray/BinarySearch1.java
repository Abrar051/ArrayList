package BinaryTreeUsingArray;

public class BinarySearch1 {
    public static void main (String args[])
    {

    }
    public void swap (int[] array)
    {
        for (int i=0;i<array.length-1;i++)
        {
            if (array[i]>array[i+1])
            {
                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
    }
    public void binarySearch (int[] array, int number , int start , int end)
    {

    }
}
