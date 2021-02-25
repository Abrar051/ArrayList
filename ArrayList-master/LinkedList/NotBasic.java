package LinkedList;

import java.util.LinkedList;
import java.util.*;
public class NotBasic {
    public static void main (String[] args)
    {
        LinkedList obj = new LinkedList();
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            String str =input.next();
            obj.add(str);
        }
        obj.add(10,15);
        System.out.println(Arrays.toString(new LinkedList[]{obj}));
    }
}
