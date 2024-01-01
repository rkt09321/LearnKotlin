package javatest.array;

public class NthLargestWithoutSorting {
	  
	int[] array = {10,19,2,3,1,98,75,65,85,850000};
	public static void main(String[] args) throws MyException{
	new NthLargestWithoutSorting(5);
	}
	 
	public NthLargestWithoutSorting(int n)throws MyException{
	 
	int[] skip = new int[n];
	int i,j,k,skipIndex=0,maxJ;
	int nthMaxValue=0;
	boolean skipLoop = false;
	 
	if(n>array.length) throw new MyException("Out of scope to grab this number");
	         
	for(i=0; i<array.length; i++){
	int val=array[i];
	maxJ = i;
	for(j=0; j<array.length; j++) {
	 
	for(k=0; k<skip.length; k++)
	if(skip[k] == j)
	skipLoop = true;
	 
	if(skipLoop){
	skipLoop = false;
	continue;
	}
	if(val < array[j]) {
	val = array[j];
	maxJ = j;
	}
	}
	if(skipIndex == n){
	nthMaxValue = array[skip[n-1]];
	break;
	}
	 
	skip[skipIndex++]=maxJ;
	}
	System.out.println(n+"rd largest value is : "+nthMaxValue);
	}
	}
	  
	class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	String msg;
	MyException(String msg){
	this.msg = msg;
	}
	public String getMessage(){
	return msg;
	}
	}
