package javatest.searching;


/**A binary search or half-interval search algorithm finds the position of a specified value (the input "key")
 *  within a sorted javatest.array. In each step, the algorithm compares the input key value with the key value of
 *  the middle element of the javatest.array. If the keys match, then a matching element has been found so its index,
 *  or position, is returned. Otherwise, if the sought key is less than the middle element's key, then the 
 *  algorithm repeats its action on the sub-javatest.array to the left of the middle element or, if the input key is greater,
 *  on the sub-javatest.array to the right. If the remaining javatest.array to be searched is reduced to zero, then the key cannot be found
 *  in the javatest.array and a special "Not found" indication is returned.
 *  Every iteration eliminates half of the remaining possibilities. This makes binary searches very efficient - even for large collections.
 *  Binary search requires a sorted javatest.collection. Also, binary javatest.searching can only be applied to a javatest.collection that allows random access (indexing).
 *    
 *  Worst case performance: O(log n)
 *    
 *  Best case performance: O(1)*/
public class BinarySearchDevideAndConquirExample {
	public static int getIndexNumber(int[] arr, int number) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[(start+end)/2]==number) {
				return (start+end)/2;
			}else if(arr[(start+end)/2]>number) {
				end=(start+end)/2;
			}else {
				start=((start+end)/2)+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		System.out.println(" Number Found At Index " + getIndexNumber(arr, 12));

	}
}
