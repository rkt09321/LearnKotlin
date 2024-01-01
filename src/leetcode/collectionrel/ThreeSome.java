package leetcode.collectionrel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
// https://leetcode.com/problems/3sum/
class ThreeSome {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> h=new HashSet<>();
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[i] + nums[j] +nums[k] == 0){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    h.add(l);
                    j++;
                    k--;
                }
                else if(nums[i] + nums[j] +nums[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> x:h)
            ans.add(x);
        return ans;
    }

    public static void main(String[] args) {
        int[] array={-1,0,1,2,-1,-4,6,5,-7};
       System.out.println(new ThreeSome().threeSum(array));
    }
}