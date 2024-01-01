package turingjava;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {
//        Integer myArray[]={2,3,1};
//        List<Integer> list = Arrays.asList(2,3,1);
//        list.sort((o1, o2) -> o2.compareTo(o1));
//        System.out.print(list);

//        List<String> countries = Arrays.asList("Germany","England","China","Denmark","Brazil","France","Australia");
//        Optional<String> country= countries.stream().reduce((c1,c2) -> c1.length()>c2.length()?c1:c2);
//        country.ifPresent(System.out::println);
        String s1;
        String s2="yes";
        System.out.print(s2);

        Set<Integer> set=new TreeSet<>();
        set.add(3);
        set.add((int)3.0);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));
        System.out.print(set);

    }

    public static void main(char[] args) {
        String s1;
        String s2="char";
        System.out.print(s2+s2);

    }
}
