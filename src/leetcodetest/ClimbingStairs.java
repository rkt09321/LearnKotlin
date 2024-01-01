package leetcodetest;

class ClimbingStairs {
    public int climbStairs(int n) {
     if(n==1 || n==2)
       return n;

	int fn = 0;
	int a= 1;
	int b= 2;

	for (int i = 3; i <= n ; i++)
	{
        fn=a+b;
        a=b;
        b=fn;
	}
	return fn ;
}   
    
}