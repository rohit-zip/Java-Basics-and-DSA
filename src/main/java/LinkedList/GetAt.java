package LinkedList;

import static LinkedList.AddLast.EMPTY;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 27 October-2023
 */

public class GetAt {
    public static class Node {
        int data;
        Node next;
    }

    public static class createLinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (size == 0) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void addFirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
            if (size == 0) tail = node;
            size++;
        }

        public void display() {
            for (Node temp = head ; temp!=null ; temp = temp.next) {
                System.out.print(temp.data + " -> ");
            }
        }

        public int getAt(int index) {
            if (size == 0) {
                System.out.println(EMPTY);
                return -1;
            } else if (index < 0 || index >= size) {
                System.out.println("Invalid Input");
                return -1;
            } else {
                Node temp = head;
                for (int i=0 ; i<index ; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }
    }

    public static void main(String[] args) {
        createLinkedList list = new createLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.display();
        System.out.println();
        System.out.println(list.getAt(4));
    }
}
