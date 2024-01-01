package leetcodetest;
// https://leetcode.com/problems/longest-palindrome/
import java.util.HashMap;
import java.util.Map;

class LongestPalindrome {
    public int longestPalindrome(String s) {
    int count=0;
	boolean isOdd = false;
	char [] ch = s.toCharArray();
	Map<Character,Integer> map = new HashMap<>();
	for(char c: ch) {
		map.put(c,map.getOrDefault(c,0)+1);
	}
	for(Map.Entry<Character,Integer> entry : map.entrySet()) {
		int key = entry.getValue();
		if(key%2==0) count += key;
		else {
			isOdd=true;
			count += key-1;
		}
	}	
	return isOdd? count+1: count;              
    }
}