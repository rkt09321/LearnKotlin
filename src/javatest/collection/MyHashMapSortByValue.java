package javatest.collection;

import java.util.*;
import java.util.Map.Entry;

public class MyHashMapSortByValue {
public static void main(String[] args) {
	Map<String,String> map= new HashMap<>();
//	TreeMap treemap=new TreeMap<Character,Integer>();
//	treemap.put('c',45);
//	String str="";
//	ArrayList<Map.Entry<Character,Integer>> arrayList=new ArrayList(treemap.entrySet());
//	for (Entry<Character, Integer> characterIntegerEntry : arrayList) {
//		str=characterIntegerEntry.getKey().toString()+characterIntegerEntry.getValue();
//	}


	map.put("Ram", "Shyam");
	map.put("arm", "hyams");
	map.put("wam", "Shyt");
	map.put("sam", "Shom");
	map.put("aam", "Sayam");
	map.put("mam", "ahyam");
	List<Entry<String, String>> list= new ArrayList<>(map.entrySet());
	Collections.sort(list, (o1, o2) -> o1.getValue().compareToIgnoreCase(o2.getValue()));
	for(Entry<String, String> entry:list) {
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
}
}
