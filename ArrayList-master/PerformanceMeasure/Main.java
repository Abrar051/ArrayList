package PerformanceMeasure;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        FunctionHolder obj = new FunctionHolder();
        Scanner input = new Scanner(System.in);
        obj.takeInput();
        System.out.println("Enter number to search : ");
        int number = input.nextInt();
        ThreadDemo t1 = new ThreadDemo("Normal",number);
        ThreadDemo t2 = new ThreadDemo("Binary",number);
        obj.compare(t1.getTime(),t2.getTime());
    }
}
