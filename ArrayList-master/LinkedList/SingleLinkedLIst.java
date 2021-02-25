package LinkedList;

public class SingleLinkedLIst {
    public Node head = null;
    public Node tail = null;
    public void addNode (int data){
        Node newNode = new Node(data);
        if (head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode ;
        }
    }
    public void display ()
    {
        Node current = head;
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("nodes of singly linked list : ");
        while (current!=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    p
    public static void main (String[] args)
    {
        SingleLinkedLIst obj = new SingleLinkedLIst();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.display();
    }
}
