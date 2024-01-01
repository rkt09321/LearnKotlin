package turingjava;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        Collection<String> collection=new ArrayDeque<>();
        collection.add("foo");
        collection.add("bar");
        collection.add("baz");
        collection.forEach(System.out::println);
    }

}
