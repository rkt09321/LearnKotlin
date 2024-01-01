package javatest.metltest;
/**
 * To find special number , number are special if 
 * its two parts are reverse to each other and sum
 * is equal to number
 * @author rajanikanttiwari
 *
 */
public class SpecialNumber {
    public static void main(String[] args) {
    	int num[]= {121,12,4,7,17};
		findNumber(num);
	}

	private static void findNumber(int[] num) {
		
		int specialCount=0;
		for(int i=0;i<num.length;i++) {
			int number=num[i];
			int first=0;
			while(true) {
				int second=number-first;
				StringBuffer buffer=new StringBuffer(String.valueOf(second));
				//buffer.append(second);
				String sec=buffer.reverse().toString();
				if(String.valueOf(first).equals(sec)) {
					specialCount=specialCount+1;
					break;
				}else if(first>second) {
					break;
				}
				first=first+1;
			}
		}
		System.out.println("SpecialNumber Are "+specialCount);
		
	}
}
