package leetcodetest;

class ReverseInteger {
    public int reverse(int x) {
        int no=0;
        while(x>0) {
            no=no*10+x%10;
            x=x/10;
        }
        return no;
    }
}
