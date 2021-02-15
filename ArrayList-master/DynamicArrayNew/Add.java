package DynamicArrayNew;
import java.util.*;
public class Add {
    String[] array;
    String[] temp;
    int size=0;
    int newCapacity=1;
    public void add (String str)
    {

        this.array = new String[size+newCapacity];

    }
    public void ensureCapacity ()
    {
        if ((this.size-this.newCapacity)==1)
        {
            this.newCapacity=3;
        }
    }
    public void printData ()
    {
        System.out.println(Arrays.toString(array));
    }
}
