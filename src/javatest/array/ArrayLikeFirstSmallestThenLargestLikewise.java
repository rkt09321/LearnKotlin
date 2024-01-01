package javatest.array;
// Java program to print the javatest.array in given order
import java.util.Arrays;

public class ArrayLikeFirstSmallestThenLargestLikewise {

	// Function which arrange the javatest.array.
	private static void rearrangeArray(int arr[], int n) {
		// Sorting the javatest.array elements
		Arrays.sort(arr); 

		int[] tempArr = new int[n]; // To store modified javatest.array

		// Adding numbers from sorted javatest.array to
		// new javatest.array accordingly
		int arrayIndex = 0;

		for(int i=0,j=n-1;i<=(n-1)/2||j>(n-1)/2;i++,j--){
			if(arrayIndex<n){
				tempArr[arrayIndex]=arr[i];
				arrayIndex++;
			}
			if(arrayIndex<n){
				tempArr[arrayIndex]=arr[j];
				arrayIndex++;
			}
		}
		for (int value : tempArr) {
			System.out.print(" "+value);
		}
		System.out.println();
		// Modifying original javatest.array
		System.arraycopy(tempArr, 0, arr, 0, n);
	} 
	
	// Driver Code 
	public static void main(String[] args) {
		int[] arr = {5, 5, 6, 8, 1, 4, 9, 3, 7, 4, 10};
		int n = arr.length; 
		rearrangeArray(arr, n);

		for (int i1 : arr) System.out.print(i1 + " ");
	} 
} 
// This code is contributed by Sumit Ghosh 
