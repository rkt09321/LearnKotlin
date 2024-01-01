package javatest.searching;
// time Complexity Url
// https://www.hackerearth.com/practice/notes/sorting-and-searching-algorithms-time-complexities-cheat-sheet/
public class MyRecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2,5, 45, 234, 567, 607, 876, 900, 976, 999 };
		int index = recursiveSearch(arr, 0, arr.length, 607);
		System.out.println(index);
	}

	private static int recursiveSearch(int[] arr, int start, int end, int key) {
		if (start < end) {
			if (arr[(start + end) / 2] == key) {
				return (start + end) / 2;
			} else if (arr[(start + end) / 2] > key) {
				return recursiveSearch(arr, start, ((start + end) / 2 - 1), key);
			} else {
				return recursiveSearch(arr, ((start + end) / 2 + 1), end, key);
			}
		}
		return -1;
	}
}