package DataStructureSort;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        Queue obj = new Queue();
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
        obj.printMain();
        System.out.println("For pop enter 1 for push enter string for break enter b : ");
        while (true)
        {
            String str1 = input.next();
            if (str1.equals("b"))
            {
                break;
            }
            else if (str1.equals("1"))
            {
                System.out.println("Your popped data is : "+obj.popData(obj.getData()));
                obj.printMain();
            }
            else
            {
                obj.push(str1, obj.getData());
                obj.printMain();
            }
        }
        obj.printMain();
    }
}
