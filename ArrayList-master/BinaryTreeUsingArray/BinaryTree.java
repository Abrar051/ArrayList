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
    public void printData (String str)
    {
        System.out.println("Child is : "+str);
        int nodeCounter = 0;
        for (int i=0;i<7;i++)
        {
            if (this.array[i].equals(str))
            {
                nodeCounter = (int) (Math.log10(i)/Math.log10(2));
                break;
            }
        }
        obj[nodeCounter].printParent();
        obj[nodeCounter-1].printGrandParent();
    }
}
