package BinaryTreeUsingArray;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        int indexCounter=0;
        Scanner input = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        InfoHolder[] object = new InfoHolder[7];
        while (true)
        {
            System.out.println("Enter string : ");
            String str = input.next();
            if (str.equals("b"))
            {
                break;
            }
            else if (str.equals("p"))
            {
                obj.printData();
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
                object[index-1]=new InfoHolder(str,index-1);
                obj.add(str,index);
            }
        }
    }
}
