package LinkedList;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - LinkedList
 * @created_on - 10 October-2023
 */

public class AddLast {

    public static class Node{
        int data;
        Node next;
    }

    public static class CustomLinkedList{
        Node head;
        Node tail;
        int size;

        public void addLast(int value){
            Node node = new Node();
            node.data = value;
            if (size == 0){
                tail = head = node;
            } else {

            }
        }
    }
}
