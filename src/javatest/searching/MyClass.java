package javatest.searching;

public class MyClass {
    public static void main(String[] args) {
        int[] array = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};
        int key = 1;
        System.out.println("Index of Search Element " + searchKeyIndex(array, 0, array.length - 1, key));
    }


    private static int searchKeyIndex(int[] array, int low, int high, int key) {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(array[mid] == key)
            return mid;
        if(array[low]<=array[mid]) {
            if(key>=array[low] && key<=array[mid])
                return searchKeyIndex(array,low,mid-1,key);
            return searchKeyIndex(array,mid+1,high,key);
        }
        if(key>=array[mid] && key<=array[high])
            return searchKeyIndex(array,mid+1,high,key);
        return searchKeyIndex(array,low,mid-1,key);
    }
}
