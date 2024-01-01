package collectionadvanced

class LinkedListRemoveLoop {
    internal class Node(val data: Int) {
        var next: Node? = null
    }

    companion object {
        private var head: Node? = null

        @JvmStatic
        fun main(args: Array<String>) {
            val loop = LinkedListRemoveLoop()
            head = Node(37)
            head?.next = Node(72)
            head?.next?.next = Node(92)
            head?.next?.next?.next = Node(87)
            head?.next?.next?.next?.next = Node(17)
            head?.next?.next?.next?.next?.next = head?.next?.next
            loop.detectAndRemove(head)
            loop.printList(head)
        }
    }

    private fun printList(head: Node?) {
        var headNode=head
        while (headNode!=null){
            println(headNode.data)
            headNode=headNode.next
        }
    }

    private fun detectAndRemove(head: Node?) {
        var slowPointer = head
        var fastPointer = head
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
              slowPointer=slowPointer.next
             fastPointer=fastPointer.next?.next
              if(slowPointer==fastPointer) {
                  detectAndRemoveNode(slowPointer,head)
                  return
              }
        }
        return
    }

    private fun detectAndRemoveNode(loop: Node?, current: Node?) {
        var ptr1=current
        var ptr2:Node?=null
        while (true) {
            ptr2=loop
            while(ptr2?.next!=loop && ptr2?.next!=ptr1) {
                ptr2=ptr2?.next
            }
            if(ptr2?.next==ptr1){
                break
            }
            ptr1=ptr1?.next
        }
        ptr1?.next = null
    }

}