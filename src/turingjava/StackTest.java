package turingjava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        ((LinkedList<String>) queue).add(stack.pop());
        stack.push("Dingleberry");
        stack.push("Eggplant");
        ((LinkedList<String>) queue).add("Fig");
        stack.push(queue.remove());
        ((LinkedList<String>) queue).add(stack.pop());
        ((LinkedList<String>) queue).add(stack.pop());
        System.out.print(stack);
        System.out.print(queue);
    }
}
