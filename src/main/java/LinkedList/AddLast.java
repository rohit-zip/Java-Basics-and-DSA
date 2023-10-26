package LinkedList;

import java.util.LinkedList;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 25 October-2023
 */
public class AddLast {

    public static final String EMPTY = "List Empty";

    public static class Node {
        int data;
        Node next;
    }

    public static class CreateList {
        Node head;
        Node tail;
        int size;

        public void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (size == 0) {
                tail = head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next)
                System.out.print("(" + temp.data + ") -> ");
        }

        public void addFirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            if (size == 0) {
                tail = node;
            }
            head = node;
            size++;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println(EMPTY);
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println(EMPTY);
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println(EMPTY);
                return -1;
            } else {
                return tail.data;
            }
        }

        public void removeLast() {
            if (size == 0) System.out.println(EMPTY);
            else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i=0 ; i<size - 2 ; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        CreateList list = new CreateList();
        list.addLast(1); //tail = head
        list.addLast(2); // tail
        list.addFirst(4); // head
        list.addFirst(5); // head
        list.display();
    }
}
