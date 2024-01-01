package leetcodetest.arrayrelated;

class TwoSumInputSorted {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
      int first=0;int last=numbers.length-1;
        for(int i=0;i<numbers.length;i++) {
            if(numbers[first]+numbers[last]==target) {
               arr[0]=first+1;
                arr[1]=last+1;
            }
            if(numbers[first]+numbers[last]>target) {
                last-=1;
            } else {
                first+=1;
            }
        }
        return arr;
    }
}