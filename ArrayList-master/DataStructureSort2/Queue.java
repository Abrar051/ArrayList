
package DataStructureSort2;
import java.util.Arrays;
public class Queue {
    String[] array = new String[5];
    int indexCounter=0;
    int nullCounter=0;
    public void push (String obj)
    {
        this.array[this.indexCounter]=obj;
        this.indexCounter++;
        if (this.indexCounter==5)
        {
            this.indexCounter=0;
        }
    }
    public String pop ()
    {
        String temp = this.array[this.nullCounter];
        this.array[this.nullCounter]=null;
        this.nullCounter++;
        if (this.nullCounter==5)
        {
            this.nullCounter=0;
        }
        return temp;
    }
    public void printInfo ()
    {
        System.out.println("Enter 1 to pop data b to break or enter other string to push : ");
    }
    public void printData ()
    {
        System.out.println(Arrays.toString(this.array));
    }
}
