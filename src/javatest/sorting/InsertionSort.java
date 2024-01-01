package javatest.sorting;
//https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm
public class InsertionSort {
	public static void main(String[] args) {
		int[] elements = { 3, 2, 5, 7, 1,5, 9 };
		insertionSort(elements);
	}

	private static void insertionSort(int[] elements) {
		for (int i = 1; i < elements.length; i++) {
			int key = elements[i];
			int j = i - 1;
			while (j >= 0 && key < elements[j]) {
				elements[j + 1] = elements[j];
				j--;
			} // end while loop
			elements[j + 1] = key;
		} // end for loop
		for (int j : elements) {
			System.out.print(" " + j);
		}

	}
}
