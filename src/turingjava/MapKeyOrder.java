package turingjava;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapKeyOrder {
    public static void main(String[] args) {
        Map<String, String> cityMap = new ConcurrentSkipListMap<>();
        cityMap.put("ND", "New Delhi");
        cityMap.put("MU", "Mumbai");
        cityMap.put("CH", "Chennai");
        cityMap.put("HD", "Hyderabad");
        Set<Map.Entry<String, String>> citySet = cityMap.entrySet();
        citySet.forEach((m)->System.out.println("key " + m.getKey()
                + " value " + m.getValue()));

        ArrayList<String > al=new ArrayList<>();
        al.sort(Comparator.comparing(p-> p.length()));
        al.sort(Comparator.comparing(String::length));

        float x=22.9f;
        System.out.print(Math.round(x));

    }
}
