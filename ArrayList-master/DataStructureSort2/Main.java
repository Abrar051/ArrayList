package DataStructureSort2;
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Queue obj = new Queue();
        obj.printInfo();
        while (true) {
            String str = input.next();
            if (str.equals("1")) {
                obj.pop();
            }
            else if (str.equals("b")){
                break;
            }
            else
            {
                obj.push(str);
            }
            obj.printData();
        }
    }
}
