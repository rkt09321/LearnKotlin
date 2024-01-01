package leetcodetest;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int no = 0;
        int original = x;
        while (x > 0) {
            no = no * 10 + x % 10;
            x = x / 10;
        }
        return no == original;
    }
}

