package leetcodetest;
// https://leetcode.com/problems/pascals-triangle/
import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
    int temp = 1;
    for(int i = 0 ; i < numRows ; i++){
        List<Integer>list = new ArrayList<>();
        int val = 1;
        for(int j = 0 ; j < temp ; j++){
            list.add(val);
            val = val*(i-j)/(j+1);
        }
        temp++;
        ans.add(list);
    }
    return ans; 
    }
}