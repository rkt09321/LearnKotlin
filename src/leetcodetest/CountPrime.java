package leetcodetest;

class CountPrime {
    public int countPrimes(int n) {
        int countPrime=1;
        if(n<2) {
            return 0;
        }
        for(int i=3;i<=n;i++) {
            if(isPrime(i)) {
              countPrime+=1;  
            }
        }
        return countPrime;
    }
    public boolean isPrime(int i) {
        for(int j=2;j<=i/2;j++) {
            if(i%j==0) {
                return false;
            }
        }
        return true;
    }
}