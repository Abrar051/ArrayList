package ArraySwap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String[] array = new String[size];
        for (int i=0;i<size;i++)
        {
            array[i]= input.next();
        }
        System.out.println(Arrays.toString(array));
        size++;
        String[] array1 = new String[size];
        for (int i=0;i< array.length;i++)
        {
            array1[i]=array[i];
        }
        System.out.println(Arrays.toString(array1));
    }
}