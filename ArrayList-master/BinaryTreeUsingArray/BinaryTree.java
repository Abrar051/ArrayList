package BinaryTreeUsingArray;
import java.util.*;
public class BinaryTree {
    public int arraySize=15;
    String[] array = new String[arraySize];
    public int treeIndex;
    //n node indicator
    InfoHolder[] obj = new InfoHolder[arraySize];
    public void add (String str , int index)
    {
        if ((index-1)<0 || (index-1)>(arraySize-1))
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
        int positionCounter=0;
        for (int i=0;i<arraySize;i++)
        {
            if (this.array[i].equals(str))
            {
                nodeCounter = (int) (Math.log10(i+1)/Math.log10(2))+1;
                positionCounter = i;
                System.out.println("Node is : "+nodeCounter);
                break;
            }
            //for (int i=0;i)
        }
        for (int i=0;i<nodeCounter;i++)
        {
            if (positionCounter%2==0)
            {

            }
            else
            {
                int parentPosition ;
            }
        }
    }
}
