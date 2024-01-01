package javatest.array;


/* Find Second Largest Number */

public class MyTestSecond {
    public static void main(String[] args) {
        // intialize the javatest.array values
        int[] arr = {100, 100, 23, 47, 81, 89, 92, 92, 52, 48, 56, 66, 65};
        int largest = 0;
        int secondLargest = 0;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else {
                if (i > secondLargest && i < largest)
                    secondLargest = i;
            }

        }
        System.out.println("Second Largest  "+secondLargest);
    }
}