package leetcodetest;
// https://leetcode.com/problems/happy-number/

import java.util.HashMap;

class HappyNumber {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a, sum;
        while (n != 1) {
            map.put(n, 1);
            sum = 0;
            while (n != 0) {

                a = n % 10;
                sum += (a * a);
                n = n / 10;
            }
            n = sum;
            if (map.containsKey(n))
                return false;
        }
        return true;
    }
}