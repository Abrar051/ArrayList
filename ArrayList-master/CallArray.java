///Dynamic array

import java.util.Scanner;
public class CallArray {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        DynamicArray str = new DynamicArray();
        int length=0;
        while (true)  //taking input
        {
            System.out.println("Enter b for break or enter string :  ");

            while (true)
            {
                String arr = input.next();
                if (arr.equals("b"))
                {
                    break;
                }
                else
                {
                    str.add(arr);
                    length++;
                }
            }
            break;
        }
        System.out.println("Your array size is : "+length);
        str.printString();
        //str.add(2,"bmhh");
        //str.put(0,"hyhyh");
        //problem showing on position eleven
        str.put(3,"3");
        str.printString();
        str.put(10,"10");
        str.printString();
        str.put(11,"11");
        str.printString();
        str.put(12,"12");
        str.printString();
        str.put(8,"8");
        str.printString();
        str.put(1,"1");
        str.printString();
    }
}
