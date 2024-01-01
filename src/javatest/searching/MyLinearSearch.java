package javatest.searching;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 56, 89, 86, 57, 38, 49, 67, 78 };
		int noFount = 86;
		System.out.println(" Key "+noFount+" Found At Index "+linearSearch(arr,noFount));
	}

	private static int linearSearch(int[] arr, int noFount) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==noFount)
			{
				return i;
			}
		}
		return -1;
	}
	
}
