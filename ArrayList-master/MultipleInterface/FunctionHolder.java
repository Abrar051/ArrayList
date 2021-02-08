package MultipleInterface;

public class FunctionHolder implements Interface1,Interface2 {
    @Override
    public void printInfo1() {
        System.out.println("This is from interface 1");
    }

    @Override
    public void printInfo2() {
        System.out.println("This is from interface 2 printing info 2");
    }

    @Override
    public void print() {
        System.out.println("This is from interface 2");
    }
}
