package ArrayList;
import java.util.*;
public class GenericDemo {
    public static void main (String args[])
    {
        DynamicArray obj = new DynamicArray();
        Scanner input = new Scanner(System.in);
        while (true)
        {
            while (true)
            {

                String str = input.next();
                if (str.equals("b"))
                {
                    break;
                }
                else
                {
                    obj.add(str);
                }
            }
            break;
        }
        obj.print();
    }
}
