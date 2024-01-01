package turingjava;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("foo");
        List<String> list2=list1;
        List<String> list3 = new ArrayList<>(list2);
        list1.clear();
        list2.add("bar");
        list3.add("baz");
        System.out.print(list1);
        System.out.print(list2);
        System.out.print(list3);
    }


}
