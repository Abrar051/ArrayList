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
        obj.pop();
        obj.printMain();
        obj.pop();
        obj.printMain();
        obj.pop();
        obj.printMain();
        obj.pop();
        obj.printMain();
        obj.push("add");
        obj.printMain();
    }
}
