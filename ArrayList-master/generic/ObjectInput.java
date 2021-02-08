package generic;
import java.util.*;
public class ObjectInput {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        ObjectType1<String>obj1 = new ObjectType1<>();
        ObjectType2<Integer>obj2= new ObjectType2<>();
        obj1.value="dergrggg";
        obj2.value=23;
        compare(obj1.converter(), obj2.converter());
    }
    public static void compare (String str1 , String str2)
    {
        if (str1.equals(str2))
        {
            System.out.println("Both object is same");
        }
        else if (str1.length()>str2.length())
        {
            System.out.println("Object 1 has bigger data");
        }
        else if (str1.length()<str2.length())
        {
            System.out.println("Object 2 has bigger data");
        }
    }
}
