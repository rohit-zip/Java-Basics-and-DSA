package LinkedList;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 27 October-2023
 */

public class AddAt {

    private static class Node {
        int data;
        Node next;
    }

    private static class CreateList {
        Node head;
        Node tail;
        int size;

        public void addFirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
            if (size == 0) tail = node;
            size++;
        }

        public void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (size == 0)
                head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void display() {
            for (Node temp = head ; temp!=null ; temp=temp.next)
                System.out.print(temp.data + " -> ");
            System.out.println();
        }

        public int size() {
            return size;
        }

        public void addAt(int data, int index) {
            if (index < 0 || index > size)
                System.out.println("Invalid Input");
            else if (index == 0) {
                addFirst(data);
            } else if (index == size) {
                addLast(data);
            } else {
                Node node = new Node();
                node.data = data;
                Node temp = head;
                for (int i=0 ; i<index-1 ; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
