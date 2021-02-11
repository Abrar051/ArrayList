package Stack;
import java.util.*;
public class Stack {
    String[] array = new String[5];
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
        for (int i=0;i<this.array.length;i++)
        {
            if (this.array[i]==null)
            {
                this.array[i]=obj;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public String pop ()
    {
        String temp = null;
        int nullCounter=0;
        int pureLength=1;
        for (int i=0;i< array.length;i++)
        {
            if (this.array[i]==null)
            {
                if (i==0)
                {
                    System.out.println("Array out of index ");
                    break;
                }
                else
                {
                    nullCounter++;
                    if (nullCounter==1)
                    {
                        temp=this.array[i-1];
                        this.array[i-1]=null;
                        break;
                    }
                }

            }
            else
            {
                pureLength++;
            }
        }
        if (nullCounter==0)
        {
            temp=this.array[array.length-1];
            this.array[array.length-1]=null;
            return temp;
        }
        return temp;
    }
}
