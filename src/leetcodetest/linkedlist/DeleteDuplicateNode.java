package leetcodetest.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class DeleteDuplicateNode {
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null) return null;
        ListNode p = head;
        ListNode q = head.next;

        while (q != null) {
            if (p.val == q.val) {
                p.next = q.next;
                q = p.next;
            }
            else {
                p = p.next;
                q = q.next;
            }
        }
        return head;
    }
   static ListNode head;
   static class ListNode {
        ListNode next;
        int val;
        public ListNode(int val){
           this.val = val;
           next=null;
        }
    }

    public static void main(String[] args) {
        DeleteDuplicateNode listNode=new DeleteDuplicateNode();
        listNode.head=new ListNode(45);
        head.next=new ListNode(45);
        head.next.next=new ListNode(60);
        head.next.next.next=new ListNode(75);
        head.next.next.next.next=new ListNode(80);
       ListNode headNode=listNode.deleteDuplicates(head);
        while (headNode!=null) {
            System.out.println(headNode.val);
            headNode=headNode.next;
        }
    }
}