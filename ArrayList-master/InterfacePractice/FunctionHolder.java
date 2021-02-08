package InterfacePractice;
import java.util.*;
public class FunctionHolder implements Interface {
    Scanner input = new Scanner(System.in);
    public void print() {
        System.out.println("Something");
    }
    public void input() {
        int a = input.nextInt();
    }
    public void operation() {
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+b);
    }
}
