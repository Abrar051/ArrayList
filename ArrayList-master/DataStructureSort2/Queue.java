
package DataStructureSort2;
import java.util.Arrays;
public class Queue {
    String[] array = new String[5];
    int indexCounter=0;
    int nullCounter=0;
    public void push (String obj)
    {
        for (int i=0;i<5;i++)
        {
            if (this.array[i]==null)
            {
                this.indexCounter=i;
                this.nullCounter=this.indexCounter+1;
                if (this.nullCounter==5)
                {
                    this.nullCounter=0;
                }
                break;
            }
            else
            {
                this.nullCounter=0;
                break;
            }
        }
        this.array[this.indexCounter]=obj;
        this.indexCounter++;
        if (this.indexCounter==5)
        {
            this.indexCounter=0;
        }
    }
    public void pop ()
    {

        this.array[this.nullCounter]=null;
        this.nullCounter++;
        if (this.nullCounter==5)
        {
            this.nullCounter=0;
        }
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
