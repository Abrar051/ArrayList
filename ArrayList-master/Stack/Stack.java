package Stack;
import java.util.*;
public class Stack {
    String[] array = new String[5];
    int nullCount=0;
    int indexCounter=0;
    Scanner input = new Scanner(System.in);
    public void input ()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter string : "+(i+1));
            array[i]=input.next();
        }
    }
    public String[] getdata ()
    {
        return array;
    }
    public void printData ()
    {
        System.out.println(Arrays.toString(array));
    }
    public void popPush ()
    {
        System.out.println("Enter 1 to pop and other string to push data : ");
    }
    public void push (String obj)
    {
        if (this.array[this.indexCounter]==null)
        {
            this.array[this.indexCounter]=obj;
        }
        else
        {
            this.indexCounter++;
            if (this.indexCounter==(array.length))
            {
                this.indexCounter=0;
            }
            this.array[this.indexCounter]=obj;
        }
        if (indexCounter== array.length)
        {
            indexCounter=0;
        }
        System.out.println(Arrays.toString(array));
    }
    public String pop ()
    {
        String temp = this.array[indexCounter];
        if (indexCounter==0)
        {
            System.out.println("Array out of index");
        }
        else
        {
            this.array[indexCounter]=null;
            indexCounter--;
        }
        return temp;
    }

}
