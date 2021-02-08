import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {
    public int length;
    String[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new String[1];
    }

    public int getSize() {

        return data.length;
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void add(String obj) {

        ensureCapacity(size + 1);
        data[size++] = obj;
    }

    public boolean add(int index, String obj) {
        data[index] = obj;
        return false;
    }


    public void put(int index, String obj) {
        int arrayLength = this.data.length;
        int newArraySize = 0;
        if(index > arrayLength)
        {
             newArraySize = this.countNewArraySize(arrayLength, index);
        }
        else {
            if(this.data[index-1] == null)
            {
                this.data[index-1] = obj;
                return;
            }else {
                newArraySize = arrayLength+5;
            }
        }
        String[] arr = this.newArray(newArraySize);
        arr = this.copyOldArray(arr, index, obj);
        this.data = arr;
        //System.out.println("old array size:"+arrayLength );
        //System.out.println("new array size:"+ newArraySize);
        //System.out.println(arr);

    }

    private String[] copyOldArray(String[] newArray, int index, String obj){
        for(int i = 0; i< this.data.length; i++)
        {
            if(i == index)
            {
                newArray[i] = obj;
            }
            else if( i < index)
            {
                newArray[i] = this.data[i];
            }
            else {
                newArray[i+1] = this.data[i];
            }
        }
        return newArray;
    }


    private String[] newArray(int size){
        return new String[size];
    }



    private int countNewArraySize(int arrayLength, int index) {
        for (int i=arrayLength; i< index; i++){
            arrayLength+=5;
        }
        return arrayLength;
    }


    public void printString() {
        System.out.println(Arrays.toString(data));
    }

    private void ensureCapacity(int minimumCapacity) {
        int oldSize = data.length;
        if (minimumCapacity > oldSize) {
            int newCapacity = oldSize + 5;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public int lengthCounter ()
    {
        int length=0;
        while (true) {
            if (data[length] == null) {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
    public void remove(String str) {
        //int length = lengthCounter();
        for (int i=0;i<data.length;i++)
        {
            if (data[i]==str)
            {
                data[i]=null;
            }
        }
        nullRemover();
    }
    public void nullRemover ()
    {
        String[] refinedArray = new String[data.length];
        int count = -1;
        for(String s : data) {
            if(s != null) { // Skips over null values
                refinedArray[++count] = s;
            }
        }
        // Returns an array with the same data but refits it to a new length

        data = Arrays.copyOf(refinedArray, count + 1);
    }
    public void remove (int index , String str)
    {
        data[index-1]=null;
        nullRemover();
    }

}
