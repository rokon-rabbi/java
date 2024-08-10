package LinkedList;

public class LinkedList {
    //    initialization of node head elemnet
    Node head;
    //    method for insert node in specidfic position

    //    method for insert node at last
    public void add(int data, int pos) {
        System.out.println(head);

        Node node = new Node(data);
        System.out.println(node);
        if (pos == 0) {
            System.out.println("0 pos"+head);
            node.next = head;

            head = node;
            System.out.println("node"+head);

        } else {
            Node current = head;
            System.out.println("else"+current);

            for (int i = 0; i < pos - 1 && current != null; i++) {
                System.out.println(i+"iteration"+current);
                current = current.next;

            }
            if (current == null) {

                System.out.println("previous node is null");

                return;
            }

            node.next = current.next;
            System.out.println("last"+node);
            current.next = node;

        }
    }

    //    method for insert node at last
    public void addLast(int data) {

        Node node = new Node(data);

        if (head == null) {

            head = node;

        } else {

            Node current = head;

            while (current.next != null) {

                current = current.next;

            }
            current.next = node;
        }

    }

    //    add element at first
    public void addFirst(int data) {

        Node node = new Node(data);

        node.next = head;

        head = node;

    }

    public void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " and memory=" + current.next + " -> ");

            current = current.next;
        }
    }

    //    method for clear all element in linkedlist
    public void clear() {
        head = null;
    }
}