package javatest.sorting

internal class RemoveLoopFromLinkedListTest {
    internal class Node(var data: Int) {
        var next: Node? = null
    }

    private fun detectAndRemoveLoop(head: Node?): Int {
        var slowPointer = head
        var fastPointer = head
        while (slowPointer != null && fastPointer != null && fastPointer?.next != null) {
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next?.next
            if (slowPointer == fastPointer) {
                removeLoop(slowPointer, head)
                return 1
            }
        }
       return 0
    }

    private fun removeLoop(loop: Node?, current: Node?) {
        var ptr1: Node?=current

        var ptr2: Node?
        while (true){
            ptr2=loop
            while (ptr2?.next!=loop && ptr2?.next!=ptr1){
                ptr2=ptr2?.next
            }
            if(ptr2?.next==ptr1){
                break
            }
            ptr1 = ptr1?.next
        }
        ptr2?.next=null

    }

    companion object {
        var head: Node? = null

        @JvmStatic
        fun main(args: Array<String>) {
            val linkedListTest = RemoveLoopFromLinkedListTest()
            head = Node(45)
            head?.next = Node(73)
            head?.next?.next = Node(37)
            head?.next?.next?.next = Node(32)
            head?.next?.next?.next?.next = head?.next
            linkedListTest.detectAndRemoveLoop(head)
            linkedListTest.printList(head)
        }
    }

    private fun printList(head: Node?) {
        var headNode=head
        while (headNode!=null){
            println(headNode.data.toString())
            headNode=headNode?.next
        }
    }
}

