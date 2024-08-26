package Linkedlist222;

public class LinkedList {
    Node head;

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = node;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.Next = head;
        head = node;

    }

    public void addAtpos(int data, int pos) {
        Node node = new Node(data);
        if (pos == 0) {
            node.Next = head;
            head = node;
            return;
        }
        Node current = head;
        for (int i = 0; i < pos-1 && current != null; i++) {
            current = current.Next;
        }
        if (current == null) {

            System.out.println("previous node is null");

            return;
        }
        node.Next = current.Next;
        current.Next = node;

    }
    // Reverse the list
//    public void reverse() {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//        while (current != null) {
//            next = current.next;hhhhhhhhhhhhh
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }

    // Remove the first node
//    public void removeFirst() {
//        if (head != null) {
//            head = head.next;
//        }
//    }
//
//    // Remove the last node
//    public void removeLast() {
//        if (head == null) return;
//
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//
//        Node current = head;
//        while (current.next.next != null) {
//            current = current.next;
//        }
//        current.next = null;
//    }
//
//    // Remove a node at a specific position
//    public void removeAt(int position) {
//        if (position < 0 || head == null) throw new IndexOutOfBoundsException("Invalid index");
//
//        if (position == 0) {
//            head = head.next;
//            return;
//        }
//
//        Node current = head;
//        for (int i = 0; i < position - 1; i++) {
//            if (current == null || current.next == null) throw new IndexOutOfBoundsException("Index out of bounds");
//            current = current.next;
//        }
//        current.next = current.next.next;
//    }
    // Display all nodes in the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.Next;
        }
//        System.out.println("null");
    }
}
