package javatest.oopsconcept;

public class RecursionFunction {
public static void main(String[] args) {
	recurtion(5);
}

private static void recurtion(int no) {
	// TODO Auto-generated method stub
	if(no==0){
		System.out.println("h="+no);
	}else{
		recurtion(no-1);
		System.out.println("h= "+no);
	}
}
}
