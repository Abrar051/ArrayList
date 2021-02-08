package ArrayList;
import java.util.Arrays;
public class DynamicArray {
    int size=0;
    String[] data ;
    public void add (String obj)
    {
        data[size]=obj;
        this.size++;
    }
    public void print ()
    {
        System.out.println(Arrays.toString(data));
    }
    public void put (String obj)
    {
    }
    public void remove ()
    {

    }
    private void ensureCapacity(int minimumCapacity) {
        int oldSize = data.length;
        if (minimumCapacity > oldSize) {
            int newCapacity = oldSize + 1;
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
