package leetcodetest.arrayrelated;

class MaximumSubArray {
    public int maxSubArray(int[] nums) {
      int maxNo=0;
      int maxSum=0;
        for(int i=0;i<nums.length;i++) {
            maxSum+=nums[i];
            maxNo=Math.max(maxNo,maxSum);
            if(maxSum<0){
              maxSum=0;  
            }
        }
        return maxNo;
    }
}