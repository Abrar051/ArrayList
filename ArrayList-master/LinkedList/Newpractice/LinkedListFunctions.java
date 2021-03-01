package LinkedList.Newpractice;

public class LinkedListFunctions {
    Node head;
    public void add (int data)
    {
        Node obj = new Node(data);
        if (head==null)
        {
            head=obj;
        }
    }
}
