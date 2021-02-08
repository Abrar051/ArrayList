package generic;
import java.util.*;
public class Container {
    public String name;
    public int roll;
    public float marks;
    Container (String name , int roll , float marks)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public  String allstrConverter ()
    {
        String name = this.name;
        Object roll = this.roll;
        Object marks = this.marks;
        String net = name + roll.toString() + marks.toString();
        System.out.println(net);
        return net;
    }
}
