package collectionadvanced;

public class LinkedListReverseTest {
    static Node head;
    static class Node {
       int data;
       Node next;
       public Node(int data) {
           this.data = data;
           next = null;
       }
    }
    public static void main(String[] args) {
        head=new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(30);
        head.next.next.next = new Node(45);
        System.out.println("LinkedList");
        printList(head);
        System.out.println("ReverseLinkedList");
        head=reverseLinkedList(head);
        printList(head);
    }

    private static Node reverseLinkedList(Node head) {
        Node prev=null;
        Node next;
        Node current = head;
        while (current != null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    private static void printList(Node head) {
        while (head!=null){
            System.out.print(" "+head.data);
            head=head.next;
        }
        System.out.println();
    }
}
