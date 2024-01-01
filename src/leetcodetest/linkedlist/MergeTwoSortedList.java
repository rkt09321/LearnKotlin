package leetcodetest.linkedlist;

class MergeTwoSortedList {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode(0,null);
//        ListNode temp = head;
//
//        while(true) {
//
//		if(l1!=null && l2!= null) {
//			temp.next = new ListNode(0,null);
//			temp = temp.next;
//			if(l1.val<=l2.val) {
//				temp.val = l1.val;
//				l1 = l1.next;
//			} else {
//				temp.val = l2.val;
//				l2 = l2.next;
//			}
//		} else if(l1!=null) {
//			temp.next = new ListNode(0,null);
//			temp = temp.next;
//			temp.val = l1.val;
//			l1 = l1.next;
//		} else if(l2!=null) {
//			temp.next = new ListNode(0,null);
//			temp = temp.next;
//			temp.val = l2.val;
//			l2 = l2.next;
//		} else {
//			break;
//		}
//	}
//        temp = head;
//        head = head.next;
//        temp = null;
//        return head;
//    }
}