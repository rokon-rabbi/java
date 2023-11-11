package LinkedList;

public class LinkedList {
    //    initialization of node head elemnet
    Node head;
//    method for insert node in specidfic position

    //    method for insert node at last
    public void add(int data, int pos) {

        Node node = new Node(data);

        if (pos == 0) {

            node.next = head;

            head = node;

        } else {
            Node current = head;

            for (int i = 0; i < pos - 1 && current != null; i++) {

                current = current.next;

            }
            if (current == null) {

                System.out.println("previous node is null");

                return;
            }

            node.next = current.next;

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