package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleLinkedLIst {
    int data;
    int position = 1;
    int length = 1;
    public int size;
    public Node head = null;
    public Node tail = null;
    public Node pointer;
    ArrayList obj = new ArrayList();

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
        size++;
    }

    public void forwardDisplay() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            for (int i = 0; i < position; i++) {
                current = current.next;
                if (i == (position - 1)) {
                    System.out.print(current.data + " ");
                }
            }
            System.out.println();
        }


        this.position++;

    }

    public void backwardDisplay() {
        this.position--;
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            for (int i = 0; i < position; i++) {
                current = current.next;
                if (i == (position - 1)) {
                    System.out.print(current.data + " ");
                }
            }
            System.out.println();
        }

    }

    public void backDisplay() {this.position--;
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            for (int i = 0; i < position; i++) {
                current = current.next;
                if (i == (position - 1)) {
                    System.out.print(current.data + " ");
                }
            }
            System.out.println();
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("nodes of singly linked list : ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void addNode (int data , int position)
    {
        Node newNode = new Node (data);
        if (head==null)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            Node temp, current;
            int count = position;
            temp = head;
            current = null;
            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
    }
    public void addInMid(int data) {

        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp, current;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp = head;
            current = null;
            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    public void reverseDisplay(Node node) {
        reverse(head);
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public Node findNode(int val) {
        Node pointer = new Node(val);

        while (true) {
            if(pointer.next ==null)
                break;

            if(pointer.data == val)
                return pointer;

            pointer = pointer.next;

        }
        return pointer;

    }
    public int searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        return i;
    }

    /*public void remove (int data)
    {
        Node pointer = findNode(data);
        Node temp,current;
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            if (head!=tail)
            {
                temp = head;
                current = null;
                while (true)
                {
                    current=temp;
                    temp=temp.next;
                    if (current==pointer)
                    {
                        current.next=temp.next;
                        temp=null;
                        break;
                    }
                    else
                    {
                        head = tail = temp.next;
                        temp = null;
                    }
                }
            }
            else
            {
                head=tail=null;
            }
        }
        size--;
    }*/
    public void remove (int data) {
        Node temp, current;
        Node pointer = findNode(data);
        int i=0;
        int position = searchNode (data);
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if( head != tail ) {
                temp = head;
                current = null;
                while (true)
                {
                    i++;
                    current = temp;
                    temp = temp.next;
                    if (i==(position-1)) {
                        break;
                    }
                }
                if(current != null) {
                    current.next = temp.next;
                    temp = null;
                }
                else {
                    head = tail = temp.next;
                    temp = null;
                }
            }
            else {
                head = tail = null;
            }
        }
        size--;
    }
}
