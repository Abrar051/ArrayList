package DynamicArray2;
import java.util.*;
public class main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        DynamicArray obj = new DynamicArray();
        System.out.println("Enter b to break else enter string : ");
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
        obj.put(2,"2");
        obj.put (3,"3");
        obj.put(4,"4");
        obj.put(0,"0");
        obj.put(11,"11");
        obj.put(14,"14");
        obj.printArrray();
    }
}
