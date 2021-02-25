package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleLinkedLIst {
    public Node head = null;
    public Node tail = null;
    ArrayList obj = new ArrayList();
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
    public static void main (String[] args)
    {
        SingleLinkedLIst obj = new SingleLinkedLIst();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.display();
        obj.reverseDisplay();
    }
}
