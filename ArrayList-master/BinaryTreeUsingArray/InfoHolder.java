package BinaryTreeUsingArray;

public class InfoHolder {
    public String array;
    public int index;
    InfoHolder (String str , int index)
    {
        this.array=str;
        this.index=index;
    }
    public void printParent ()
    {
        System.out.println("Parent of the child is : "+this.array);
    }
}
