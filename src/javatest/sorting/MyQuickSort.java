package javatest.sorting;
// Time complexity Url
// https://www.hackerearth.com/practice/notes/sorting-and-searching-algorithms-time-complexities-cheat-sheet/

import java.util.Arrays;
/*
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is using divide and conquer
 * algorithm. Quicksort first divides a large list into two smaller sub-lists: the low elements and the
 *  high elements. Quicksort can then recursively sort the sub-lists.

Steps to implement Quick sort:
//Video Url
* https://www.youtube.com/watch?v=PgBzjlCcFvc&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW&index=2
*
*
1) Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
2) Reorder the list so that all elements with values less than the pivot come before the pivot, 
while all elements with values greater than the pivot come after it (equal values can go either way)
. After this partitioning, the pivot is in its final position. This is called the partition operation.
3) Recursively apply the above steps to the sub-list of elements with smaller values and separately 
the sub-list of elements with greater values.
*
* * COMPLEXITY:
 * Base Case: nlogn
 * Average Case: nlogn
 * Worst Case: O(n^2)
 * Space Complexity O(logn)
 */


public class MyQuickSort {
    public static void main(String[] args) {
        int[] elements = {10, 12, 15, 6, 12, 7, 10, 20, 50, 1, 4, 67, 89};
        System.out.println("Before QuickSort  : ");
        System.out.println(Arrays.toString(elements));
        quickSort(elements, 0, elements.length - 1);
        System.out.println("After QuickSort : ");
        System.out.println(Arrays.toString(elements));

    }

    private static void quickSort(int[] arr, int lower, int upper) {
        int min = lower;
        int max = upper;
        int pivot = arr[min + (max - min) / 2];
        while (min <= max) {

            while (arr[min] < pivot) {
                min++;
            }
            while (arr[max] > pivot) {
                max--;
            }
            if (min <= max) {
                exchange(arr, min, max);
                min++;
                max--;
            }
        }
        if (lower < max) {
            quickSort(arr, lower, max);
        }
        if (upper > min) {
            quickSort(arr, min, upper);
        }
    }

    private static void exchange(int[] elements, int min, int max) {
        int temp = elements[min];
        elements[min] = elements[max];
        elements[max] = temp;
    }

}
