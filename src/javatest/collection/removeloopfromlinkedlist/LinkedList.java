package javatest.collection.removeloopfromlinkedlist;
// Java program to detect and remove loop in linked list 

class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 

	// Function that detects loop in the list 
	private void detectAndRemoveLoop(Node node) {
		Node slow = node, fast = node; 
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 

			// If slow and fast meet at same point then loop is present 
			if (slow == fast) { 
				removeLoop(slow, node); 
				return;
			} 
		}
	}

	// Function to remove loop 
	private void removeLoop(Node loop, Node curr) {
		Node ptr1, ptr2;
        System.out.println(loop.data+" "+curr.data);
		/* Set a pointer to the beging of the Linked List and 
		move it one by one to find the first node which is 
		part of the Linked List */
		ptr1 = curr; 
		while (true) { 

			/* Now start a pointer from loop_node and check if it ever 
			reaches ptr2 */
			ptr2 = loop; 
			while (ptr2.next != loop && ptr2.next != ptr1) { 
				ptr2 = ptr2.next; 
			} 

			/* If ptr2 reahced ptr1 then there is a loop. So break the 
			loop */
			if (ptr2.next == ptr1) { 
				break; 
			} 

			/* If ptr2 did't reach ptr1 then try the next node after ptr1 */
			ptr1 = ptr1.next; 
		} 

		/* After the end of loop ptr2 is the last node of the loop. So 
		make next of ptr2 as NULL */
		ptr2.next = null; 
	} 

	// Function to print the linked list 
	private void printList(Node node) {
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) { 
		LinkedList list = new LinkedList(); 
		LinkedList.head = new Node(50); 
		LinkedList.head.next = new Node(20); 
		LinkedList.head.next.next = new Node(15); 
		LinkedList.head.next.next.next = new Node(4); 
		LinkedList.head.next.next.next.next = new Node(10); 

		// Creating a loop for testing 
		head.next.next.next.next = head.next.next; 
		head.next.next.next = head.next;
		list.detectAndRemoveLoop(head); 
		System.out.println("Linked List after removing loop : "); 
		list.printList(head); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
