public class Test {
    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 8, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
    }
}
