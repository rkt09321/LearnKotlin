package leetcodetest.bittypework;
// https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ret =0; 
        int power =31;
        
        while(power>=0){
            ret+=(n&1)<<power;
            n=n>>1;
            power--;
        }
        return ret;
    }
}