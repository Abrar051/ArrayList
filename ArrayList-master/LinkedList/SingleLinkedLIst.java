package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleLinkedLIst {
    int data;
    int position=1;
    public Node head = null;
    public Node tail = null;
    ArrayList obj = new ArrayList();
    public void addNode (int data){
        Node newNode = new Node(data);
        if (head==null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void forwardDisplay ()
    {
        Node current = head;
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else {
            System.out.println(current.data);
            current=current.next;
            position++;
        }

    }
    public void backwardDisplay ()
    {

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
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public void reverseDisplay ()
    {
        Node current = head;
        while (current!=null)
        {
            obj.add(current.data);
            current=current.next;
        }
        int length = obj.size();
        for (int i=length-1;i>=0;i--)
        {
            System.out.print(obj.get(i)+" ");
        }
    }
}
