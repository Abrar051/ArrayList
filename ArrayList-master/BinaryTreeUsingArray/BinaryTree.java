package BinaryTreeUsingArray;
import java.util.*;
public class BinaryTree {
    public int arraySize=15;
    String[] array = new String[arraySize];
    int nodeCounter = 0;
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
    public void printTree ()
    {
        //1st print lines which is level indicator
        for (int i=1;i<=levelCounter();i++)
        {
            //second loop array printer
            for (int j=0;j<Math.pow(2,(i-1));j++)
            {
                System.out.print(array[(int) Math.pow(2,(i-1))+j-1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public int levelCounter ()
    {
        return 3;
    }
    public void printData (String str)
    {
        System.out.println("Child is : "+str);
        int positionCounter=0;
        int parentPosition=0;
        int temp;
        int gen=1;
        for (int i=0;i<arraySize;i++)
        {
            if (this.array[i]==null)
            {
                System.out.println("Parent is null");
                break;
            }
            else if (this.array[i].equals(str))
            {
                nodeCounter = (int) (Math.log10(i+1)/Math.log10(2))+1;
                positionCounter = i+1;
                System.out.println("Level is : "+nodeCounter);
                break;
            }
        }

        while (true)
        {
                positionCounter=positionCounter/2;
                if (positionCounter==1)
                {
                    obj[0].printParent();
                    break;
                }
                else
                {
                    if (positionCounter!=0)
                    {
                        obj[positionCounter-1].printParent();
                    }
                    else
                    {
                        obj[0].printRoot();
                        break;
                    }
                }
        }
    }
}
