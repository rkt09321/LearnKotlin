package javatest.linkedlisttest;

// Java program to implement 
// a Singly Linked List 
public class LinkedListDeleteByPosition { 

	private Node head; // head of list

	// Linked list Node. 
	// This inner class is made static 
	// so that kotlintest.trickyquestion.main() can access it
	private static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) {
			data = d; 
			next = null; 
		} 
	} 
	
	// Method to insert a new node 
	private static LinkedListDeleteByPosition insert(LinkedListDeleteByPosition list, int data)
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 
	
	// Method to print the LinkedList. 
	private static void printList(LinkedListDeleteByPosition list)
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
		
		System.out.println(); 
	} 
	
	// Method to delete a node in the LinkedList by POSITION 
	public static LinkedListDeleteByPosition deleteAtPosition(LinkedListDeleteByPosition list, int index) 
	{ 
		// Store head node 
		Node currNode = list.head, prev = null; 

		// 
		// CASE 1: 
		// If index is 0, then head node itself is to be deleted 

		if (index == 0 && currNode != null) { 
			list.head = currNode.next; // Changed head 

			// Display the message 
			System.out.println(index + " position element deleted"); 

			// Return the updated List 
			return list; 
		} 

		// 
		// CASE 2: 
		// If the index is greater than 0 but less than the size of LinkedList 
		// 
		// The counter 
		int counter = 0; 

		// Count for the index to be deleted, 
		// keep track of the previous node 
		// as it is needed to change currNode.next 
		while (currNode != null) { 

			if (counter == index) { 
				// Since the currNode is the required position 
				// Unlink currNode from linked list 
				prev.next = currNode.next; 

				// Display the message 
				System.out.println(index + " position element deleted"); 
				break; 
			} 
			else { 
				// If current position is not the index 
				// continue to next node 
				prev = currNode; 
				currNode = currNode.next; 
				counter++; 
			} 
		} 

		// If the position element was found, it should be at currNode 
		// Therefore the currNode shall not be null 
		// 
		// CASE 3: The index is greater than the size of the LinkedList 
		// 
		// In this case, the currNode should be null 
		if (currNode == null) { 
			// Display the message 
			System.out.println(index + " position element not found"); 
		} 

		// return the List 
		return list; 
	} 
	private static int getMiddleElement(Node n)
	{
	    Node slow = n;
	    Node fast = n;
        int position=0;
	    while(fast!=null && fast.next!=null)
	    {
	    	
	        fast = fast.next.next;
	        slow = slow.next;
	        position+=1;
	    }

	    return position;
	}
	public static int getMiddleElement(LinkedListDeleteByPosition l)
	{
	    return getMiddleElement(l.head);
	}
	// **************MAIN METHOD************** 

	// method to create a Singly linked list with n nodes 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedListDeleteByPosition list = new LinkedListDeleteByPosition(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8);
		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);
		System.out.println(getMiddleElement(list));
		// Print the LinkedList 
		printList(list); 

		// 
		// ******DELETION AT POSITION****** 
		// 

		// Delete node at position 0 
		// In this case the key is ***at head*** 
		deleteAtPosition(list, 0); 

		// Print the LinkedList 
		printList(list); 

		// Delete node at position 2 
		// In this case the key is present ***in the middle*** 
		deleteAtPosition(list, 2); 

		// Print the LinkedList 
		printList(list); 

		// Delete node at position 10 
		// In this case the key is ***not present*** 
		deleteAtPosition(list, 10); 

		// Print the LinkedList 
		printList(list); 
	} 
} 
