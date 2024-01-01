package javatest.cachingcustom;

import java.util.*;

public class TestCache {
private Deque<Integer> deque;
private HashSet<Integer> hashSet;
private int cacheCapacity;
    public TestCache(int cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
        deque=new LinkedList<>();
        hashSet=new HashSet<>();
    }
    private void addInCache(int element){
        if(!hashSet.contains(element)){
            if(deque.size()==cacheCapacity){
                int removeElement=deque.removeLast();
                hashSet.remove(removeElement);
            }
        }else {
            int index=0;
            int i=0;

        }
    }
}
