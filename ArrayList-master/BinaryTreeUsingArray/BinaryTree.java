package BinaryTreeUsingArray;
import java.util.*;
public class BinaryTree {

    String[] array = new String[7];
    public int treeIndex;
    //n node indicator
    InfoHolder[] obj = new InfoHolder[7];
    public void add (String str , int index)
    {
        if ((index-1)<0 || (index-1)>6)
        {
            System.out.println("Array is out of index");
        }
        else
        {
            this.array[index-1]=str;
            obj[index-1] = new InfoHolder(str,index-1);
        }
    }
    public void remove (String str)
    {
    }
    public void show ()
    {

    }
    public void printData ()
    {
        System.out.println(Arrays.toString(this.array));
    }
}
