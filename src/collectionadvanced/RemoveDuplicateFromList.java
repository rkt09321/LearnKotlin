package collectionadvanced;

public class RemoveDuplicateFromList {
    static Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

   static Node removeDuplicates(Node head) {
        if(head==null || head.next==null) return head;
        Node root = head;
        while(head.next!=null){
            if(head.data!=head.next.data){
                head = head.next;
            }else{
                head.next = head.next.next;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        head=new RemoveDuplicateFromList.Node(85);
        head.next = new RemoveDuplicateFromList.Node(15);
        head.next.next = new RemoveDuplicateFromList.Node(30);
        head.next.next.next = new RemoveDuplicateFromList.Node(45);
        head.next.next.next.next = new RemoveDuplicateFromList.Node(30);
        System.out.println("LinkedList");
        printList(head);
        System.out.println("ReverseLinkedList");
        head=removeDuplicates(head);
        printList(head);
    }
    private static void printList(Node head) {
        while (head!=null){
            System.out.print(" "+head.data);
            head=head.next;
        }
        System.out.println();
    }
}
