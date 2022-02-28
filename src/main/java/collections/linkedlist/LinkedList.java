package collections.linkedlist;


public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        list.printList();
    }
}


// Second way of creating linked list

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
    }

    static void print(Node head) {

        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);

        print(head);
    }

}
