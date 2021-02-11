package Stack;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        String str;
        Stack obj = new Stack();
        obj.input();
        obj.printData();
        while (true)
        {
            obj.popPush();
            str= input.next();
            if (str.equals("1"))
            {
                obj.pop2();
                obj.printData();
            }
            else
            {
                obj.push(str);
            }
        }
    }
}
