package javatest.sorting

import java.lang.System
import javatest.sorting.StackUsingLinkedlist
import kotlin.system.exitProcess

// Java program to Implement a stack
// using singly linked list
// import package
// Create Stack Using Linked list
internal class StackUsingLinkedlist     // Constructor
{
    // A linked list node
    private inner class Node {
        var data = 0 // integer data
        var link: Node? = null // reference variable Node type
    }

    // create global top reference variable global
    private var top: Node? = null

    // Utility function to add an element x in the stack
    fun push(x: Int) // insert at the beginning
    {
        // create new node temp and allocate memory
        val temp = Node()

        // check if stack (heap) is full. Then inserting an
        // element would lead to stack overflow
        if (temp == null) {
            print("\nHeap Overflow")
            return
        }

        // initialize data into temp data field
        temp.data = x

        // put top reference into temp link
        temp.link = top

        // update top reference
        top = temp
    }

    // Utility function to check if the stack is empty or not
    val isEmpty: Boolean
        get() = top == null

    // Utility function to return top element in a stack
    fun peek(): Int {
        // check for empty stack
        return if (!isEmpty) {
            top!!.data
        } else {
            println("Stack is empty")
            -1
        }
    }

    // Utility function to pop top element from the stack
    fun pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            print("\nStack Underflow")
            return
        }

        // update the top pointer to point to the next node
        top = top!!.link
    }

    fun display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow")
            exitProcess(1)
        } else {
            var temp = top
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data)

                // assign temp link to temp
                temp = temp.link
            }
        }
    }
} // main class

object GFG {
    @JvmStatic
    fun main(args: Array<String>) {
        // create Object of Implementing class
        val obj = StackUsingLinkedlist()
        // insert Stack value
        obj.push(11)
        obj.push(22)
        obj.push(33)
        obj.push(44)

        // print Stack elements
        obj.display()

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek())

        // Delete top element of Stack
        obj.pop()
        obj.pop()

        // print Stack elements
        obj.display()

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek())
    }
}