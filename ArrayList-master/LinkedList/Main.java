package LinkedList;

public class Main {
    public static void main (String args[])
    {
        SingleLinkedLIst obj = new SingleLinkedLIst();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(5);
        obj.display();
        obj.forwardDisplay();
        obj.forwardDisplay();
        obj.forwardDisplay();
        obj.backwardDisplay();
        obj.backwardDisplay();
        //obj.reverse(obj.head);
        obj.reverseDisplay(obj.tail);
    }
}
