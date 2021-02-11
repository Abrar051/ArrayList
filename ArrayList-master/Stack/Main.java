package Stack;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        String str;
        Stack obj = new Stack();
        while (true)
        {
            obj.popPush();
            str= input.next();
            if (str.equals("1"))
            {
                obj.pop();
                obj.printData();
            }
            else
            {
                obj.push(str);
            }
        }
    }
}
