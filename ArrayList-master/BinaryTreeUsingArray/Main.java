package BinaryTreeUsingArray;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        int indexCounter=0;
        Scanner input = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        while (true)
        {
            System.out.println("Enter string (b for break , p for print data else add other strings): ");
            String str = input.next();
            if (str.equals("b"))
            {
                break;
            }
            else if (str.equals("p"))
            {
                System.out.println("Enter string to check info : ");
                String child = input.next();
                obj.printData(child);
            }
            else if (str.equals("r"))
            {

            }
            else if  (str.equals("s"))
            {

            }
            else
            {
                System.out.println("Enter index number : ");
                int index = input.nextInt();
                obj.add(str,index);
            }
        }
    }
}
