package leetcodetest.arrayrelated;

import java.util.ArrayList;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al=new ArrayList();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
               al.add(nums[i]); 
            }
        }
        int no=0;
        for(Integer i:al){
           nums[no] = i;
               no++;
        }
        return al.size();
    }
}