package javatest.cachingcustom;/* We can use Java inbuilt Deque as a double
ended queue to store the cache keys, with 
the descending time of reference from front 
to back and a set container to check presence 
of a key. But remove a key from the Deque using 
remove() , it takes O(N) time. This can be 
optimized by storing a reference (iterator) to 
each key in a hash hashset. */

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class LRUCacheUsingDeque {
    // store keys of cache
    private Deque<Integer> deque;
    // store references of key in cache
    private HashSet<Integer> hashset;
    //maximum capacity of cache
    private int capacity;

    private LRUCacheUsingDeque(int n) {
        deque = new LinkedList<>();
        hashset = new HashSet<>();
        capacity = n;
    }

    /* Refers key x with in the LRU cache */
    private void addElementInCache(int x) {
        if (!hashset.contains(x)) {
            if (deque.size() == capacity) {
                int last = deque.removeLast();
                hashset.remove(last);
            }
        } else {
			/* The found page may not be always the last element, even if it's an 
			intermediate element that needs to be removed and added to the start 
			of the Queue */
            int index = 0, i = 0;
            Iterator<Integer> itr = deque.iterator();
            while (itr.hasNext()) {
                if (itr.next() == x) {
                    index = i;
                    break;
                }
                i++;
            }
            deque.remove(index);
        }
        deque.push(x);
        hashset.add(x);

    }

    // display contents of cache
    public void display() {
        Iterator<Integer> itr = deque.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LRUCacheUsingDeque ca = new LRUCacheUsingDeque(4);
        ca.addElementInCache(1);
        ca.display();
        ca.addElementInCache(2);
        ca.display();
        ca.addElementInCache(3);
        ca.display();
        ca.addElementInCache(1);
        ca.display();
        ca.addElementInCache(3);
        ca.display();
        ca.addElementInCache(1);
        ca.display();
        ca.addElementInCache(6);
        ca.display();
    }
}
//This code is contributed by Gaurav Tiwari 
