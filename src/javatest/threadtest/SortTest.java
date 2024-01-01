package javatest.threadtest;

public class SortTest {
	public static void main(String[] args) {
		int[] elements = { 3, 2, 5, 7, 1, 9 };
		insertionSort(elements);
	}

	private static void insertionSort(int[] elements) {
		for(int i=1;i<elements.length;i++) {
			int key=elements[i];
			int j=i-1;
			while(j>=0&&key<elements[j]) {
				elements[j+1]=elements[j];
				j--;
			}
			elements[j+1]=key;
		}
		for (int j : elements) {
			System.out.print(" " + j);
		}
		StringBuffer stringBuffer=new StringBuffer("Hello World");
		stringBuffer.insert(6,"Good");
		System.out.println(stringBuffer);
	}
}
