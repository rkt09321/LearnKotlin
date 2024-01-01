package javatest.stringtest;

public class StringTokenizerExample {
public static void main(String[] args) {
	String str = "I , a'm sample str'ing and will be tokenized on space";
	/*StringTokenizer defaultStringTokenizer=new StringTokenizer(str,", '",true);
	int nooftoken=defaultStringTokenizer.countTokens();
	System.out.println("No Of Tokens "+nooftoken);
	while (defaultStringTokenizer.hasMoreElements()) {
	System.out.println(""+defaultStringTokenizer.nextToken());
*/		
	/*}*/
	System.out.println(str.split(",",23));
}
}
