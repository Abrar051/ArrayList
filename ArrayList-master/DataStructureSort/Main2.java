package DataStructureSort;
import java.util.*;
public class Main2 {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        Queue obj= new Queue();
        String[] data = new String[5];
        int index=0;
        System.out.println("Enter b to break or enter string to continue : ");
        for (int i=0;i<5;i++)
        {
            data[i]=input.nextLine();
        }
        while (true)
        {
            System.out.println("Enter 1 to pop else string to push ");
            String str = input.next();
            if (str.equals("1")) ////////pop
            {
                System.out.println("Your popped data is : "+obj.popData(data));
                System.out.println(Arrays.toString(data));
            }
            else if (str.equals("b"))
            {
                break;
            }
            else
            {
                obj.push(str,data);
            }
        }
    }
}
