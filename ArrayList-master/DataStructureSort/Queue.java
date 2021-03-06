package DataStructureSort;

import java.util.*;

public class Queue {
    private String array[];
    private int size;
    private int capacity;
    public Queue ()
    {
        array = new String[2];
        size=0;
        capacity=2;
    }
    public void ensureCapacity(int minCapacity){
        String temp[] = new String[capacity+minCapacity];
        for (int i=0; i < capacity; i++){
            temp[i] = array[i];
        }
        array = temp;
        capacity = capacity + minCapacity;
    }

    // to add an element at the end
    public void add(String element){
        // increase the capacity by 2
        if (size == capacity){
            ensureCapacity(2);
        }
        array[size] = element;
        size++;
    }
    public String[] getData ()
    {
        return array;
    }
    public void pop (String[] obj)   // this pop method picks element from first and replace null and bings the null at last position
    {
        String temp;
        obj[0]=null;
        int length=1;
        for (int i=1;i<obj.length;i++)
        {
            temp=obj[i];
            obj[i]=obj[i-1];
            obj[i-1]=temp;
        }
    }
    public void pop2 (String[] obj)
    {
        String temp;

    }




    /*public void push (String obj)
    {
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==null)
            {
                array[i]=obj;
                break;
            }
            else
            {
                System.out.println("iuiuyiy");
                add(obj);
                break;
            }
        }
    }*/
    /*private String[] sort ()
    {
        int length = this.array.length;
        String[] temp = new String[length];
        for (int i=0;i< array.length;i++)
        {
            temp [array.length-i-1]=array[i];
        }
        return temp;
    }*/
    public void printMain ()
    {
        System.out.println(Arrays.toString(array));
    }
    //
    public String popData (String[] obj)
    {
        String str = obj[0];
        pop(obj);
        return str;
    }
    public void push (String str, String[] data)
    {
        int objectCounter=0;
        for (int i=0;i<data.length;i++)
        {
            if (data[i]!=null)
            {
                continue;
            }
            else if (data[i]==null)
            {
                data[i]=str;
                System.out.println(Arrays.toString(data));
                break;
            }
        }
        for (int i=0;i< data.length;i++)
        {
            if (data[i]!=null)
            {
                objectCounter++;
            }
            if (objectCounter == data.length)
            {
                add(str);
            }
        }
    }
    public void rearrange (String[] obj)
    {
        String temp;
        obj[0]=null;
        int length=1;
        for (int i=1;i<obj.length;i++)
        {
            temp=obj[i];
            obj[i]=obj[i-1];
            obj[i-1]=temp;
        }
        //obj[length-1]=null;
    }
    private void nullRemove ()
    {
        String[] temp = new String[array.length];
        int length=0;
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==null)
            {
                break;
            }
            else
            {
                temp[i]=array[i];
                length++;
            }
        }
        array=Arrays.copyOf(temp,temp.length);
    }

}
