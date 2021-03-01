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
    public void backDisplay ()
    {

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
///add mid
public void addInMid(int data){

    Node newNode = new Node(data);
    if(this.head == null) {
        this.head = newNode;
        this.tail = newNode;
    }
    else {
        Node temp, current;
        int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
        temp = head;
        current = null;
        for(int i = 0; i < count; i++) {
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
}
