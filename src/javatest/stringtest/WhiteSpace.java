package javatest.stringtest;

public class WhiteSpace {
public static void main(String[] args) {
	String before="    ram is          a good boy";
	String after = before.trim().replaceAll(" +", " ");
	//String after=before.trim().replaceAll(" +", " ");
	//String after=before.trim().replaceAll("\\s+", " ").trim();
	
	System.out.println(""+after);
}
}
