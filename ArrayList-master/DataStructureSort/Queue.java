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
    public void pop ()
    {
        int step=1;
        while (true)
        {
            if (array[array.length-step]==null)
            {
                step++;
            }
            else
            {
                break;
            }
        }
        array[array.length-step]=null;
    }
    public void push (String obj)
    {
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==null)
            {
                array[i]=obj;
                break;
            }
        }
    }
    private String[] sort ()
    {
        int length = this.array.length;
        String[] temp = new String[length];
        for (int i=0;i< array.length;i++)
        {
            temp [array.length-i-1]=array[i];
        }
        return temp;
    }
    public void printMain ()
    {
        System.out.println(Arrays.toString(array));
    }
    public void printTemp ()
    {
        System.out.println(Arrays.toString(sort()));
    }
    //
    private void nullRemove ()
    {
        String[] temp = new String[array.length];
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==null)
            {
                break;
            }
            else
            {
                temp[i]=array[i];
            }
        }
        //array=Arrays.copyOf(temp);
    }

}
