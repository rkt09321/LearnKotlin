package leetcode.arrayrelated;
// https://leetcode.com/problems/container-with-most-water/
public class MaximumWaterArray {
    public static void main(String[] args) {
      int[]  height = {1,8,6,2,5,4,8,3};
        MaximumWaterArray array=new MaximumWaterArray();
      System.out.println(array.maxArea(height));
    }
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}