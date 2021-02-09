package DynamicArray2;

import java.util.*;

public class DynamicArray {
    private String array[];
    private int size;
    private int capacity;
    public DynamicArray(){
        array = new String[2];
        size=0;
        capacity=2;
    }
    /* method to increase the capacity, if necessary, to ensure it can hold at least the
     *  number of elements specified by minimum capacity arguement
     */
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

    //print item

    public void printArrray ()
    {
        System.out.println(Arrays.toString(array));
    }

    public void put (int index , String obj)
    {
        add (null);
        if (index<array.length)
        {
            if (index==0)
            {
                index++;
                for (int i=array.length-1;i>=index;i--)
                {
                    array[i]=array[i-1];
                }
                array[index-1]=obj;
            }
            else
            {
                for (int i=array.length-1;i>=index;i--)
                {
                    array[i]=array[i-1];
                }
                array[index-1]=obj;
            }
        }
        else if (index> array.length)
        {
            for (int i= array.length-1;i<index;i++)
            {
                add(null);
                if (i==(index-1))
                {
                    array[i]=obj;
                }
            }
        }
    }

}
