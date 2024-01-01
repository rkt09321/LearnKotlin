package turingjava;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set set= new TreeSet();
        set.add(1);
        set.add("2");
        set.add(3);
        System.out.print(set);
    }
}
