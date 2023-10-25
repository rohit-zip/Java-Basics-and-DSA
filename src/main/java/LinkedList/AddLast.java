package LinkedList;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 25 October-2023
 */
public class AddLast {

    public static class Node {
        int data;
        Node next;
    }

    public static class CreateLinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (size==0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head ; temp != null ; temp = temp.next) {
                System.out.print(temp.data + " -> ");
            }
        }

        public void printHeadAndTail() {
            System.out.println("Head : " + head.data);
            System.out.println("Tail : " + tail.data);
        }
    }

    public static void main(String[] args) {
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.addLast(2);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.display();
        linkedList.printHeadAndTail();
        //Create a method to add data at first
    }
}
