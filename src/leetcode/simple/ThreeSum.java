package leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        if(nums.length<3)return ans;
        Arrays.sort(nums);
        int b=-1,c=-1;boolean flag=true;
        for(int i=0;i<nums.length&&nums[i]<=0;i++)
        {
            int j=i+1,k=nums.length-1,p=i;
            while(j<k)
            {
                if(nums[j]+nums[k]>-nums[i])k--;
                else if(nums[j]+nums[k]<-nums[i])j++;
                else if(nums[j]+nums[k]==-nums[i])
                {
                    if(b==nums[j]&&c==nums[k])j++;
                    else if((b!=nums[j]||c!=nums[k]) || flag)
                    {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k])); 
                        b=nums[j];
                        c=nums[k];
                        flag=false;
                        j++;
                    }
                }                
            }
            while(i+1<nums.length&&nums[i]==nums[i+1])i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array={-1,0,1,2,-1,-4};
        for (List<Integer> integers : new ThreeSum().threeSum(array)) {
            System.out.print("[");
            for (Integer integer : integers) {
                System.out.print(integer);
                System.out.print(",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}