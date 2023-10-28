package LinkedList;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 28 October-2023
 */

public class RemoveDuplicates {

    private static class Node {
        int data;
        Node next;
    }

    private static class CreateList {
        Node head;
        Node tail;
        int size;

        public void addFirst(int value) {
            Node node = new Node();
            node.data = value;
            node.next = head;
            head = node;
            if (size == 0) tail = node;
            size++;
        }

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void printList() {
            Node node = head;
            while(node != null) {
                if (node != tail) System.out.print(node.data + " -> ");
                else System.out.println(node.data + " -> null");
                node = node.next;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void removeDuplicate() {
            CreateList createList = new CreateList();
            while(this.size > 0) {
                int first = getFirst();
                removeFirst();
                if (createList.size == 0 || createList.tail.data!=first) {
                    createList.addLast(first);
                }
            }
            this.head = createList.head;
            this.tail = createList.tail;
            this.size = createList.size;
        }
    }
    public static void main(String[] args) {
        CreateList linkedList = new CreateList();
        linkedList.addFirst(1);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(4);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(5);
        linkedList.addFirst(5);
        linkedList.addFirst(5);
        linkedList.printList();
        linkedList.removeDuplicate();
        linkedList.printList();
    }
}
