package javatest.sorting

import javatest.sorting.RemoveLoopFromLinkedListKt

// Java program to detect and remove loop in linked list
//Video Link
// https://www.youtube.com/watch?v=JsVGDy0u1u8
// https://www.youtube.com/watch?v=-YiQZi3mLq0
// https://www.youtube.com/watch?v=_BG9rjkAXj8
internal class RemoveLoopFromLinkedListKt {
    internal class Node(var data: Int) {
        var next: Node? = null
    }

    // Function that detects loop in the list 
    fun detectAndRemoveLoop(node: Node?): Int {
        var slow = node
        var fast = node
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next
            fast = fast.next?.next

            // If slow and fast meet at same point then loop is present 
            if (slow == fast) {
                removeLoop(slow, node)
                return 1
            }
        }
        return 0
    }

    // Function to remove loop 
    private fun removeLoop(loop: Node?, curr: Node?) {
        var ptr1: Node?=curr
        var ptr2: Node?
        // System.out.println(loop.data+" "+curr.data);
        /* Set a pointer to the beging of the Linked List and 
		move it one by one to find the first node which is 
		part of the Linked List */
        while (true) {

            /* Now start a pointer from loop_node and check if it ever 
			reaches ptr2 */
            ptr2 = loop
            while (ptr2?.next != loop && ptr2?.next != ptr1) {
                ptr2 = ptr2?.next
            }

            /* If ptr2 reahced ptr1 then there is a loop. So break the 
			loop */
            if (ptr2?.next == ptr1) {
                break
            }

            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1!!.next
        }

        /* After the end of loop ptr2 is the last node of the loop. So 
		make next of ptr2 as NULL */
        ptr2?.next = null
    }

    // Function to print the linked list 
    fun printList(node: Node?) {
        var node = node
        while (node != null) {
            print(node.data.toString() + " ")
            node = node.next
        }
    }

    companion object {
        var head: Node? = null

        // Driver program to test above functions 
        @JvmStatic
        fun main(args: Array<String>) {
            val list = RemoveLoopFromLinkedListKt()
            head = Node(50)
            head?.next = Node(20)
            head?.next?.next = Node(15)
            head?.next?.next?.next = Node(4)
            head?.next?.next?.next?.next = Node(10)

            // Creating a loop for testing 
            head?.next?.next?.next?.next = head?.next?.next;
            //head.next.next.next = head.next;
            list.detectAndRemoveLoop(head)
            println("Linked List after removing loop : ")
            list.printList(head)
        }
    }
}