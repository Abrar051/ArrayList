package LinkedListPractice1;

public class NodeFunctions {
    public Node head = null;
    public Node tail = null;
    public void add (int data)
    {
        Node obj = new Node(data);
        if (head==null)
        {
            head=obj;
        }
        else
        {
            tail.next=obj;
        }
        tail=obj;
    }
    public void print ()
    {
        Node current = head;
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
