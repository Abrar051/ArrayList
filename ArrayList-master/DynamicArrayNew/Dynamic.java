package DynamicArrayNew;
import java.util.*;
public class Dynamic {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        Add obj = new Add();
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
                obj.printData();
            }
        }
        obj.printData();
    }
}

