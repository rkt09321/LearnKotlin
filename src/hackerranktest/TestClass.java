package hackerranktest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int number = Integer.parseInt(line);
        int array[]=null;
        for (int i = 0; i < number; i++) {
         String s= br.readLine();
         String arr[]=s.split(" ");
         array=new int[arr.length];
         for (int j=0;j< arr.length;j++) {
             array[j]=Integer.parseInt(arr[j]);
         }
        }
        String numStr = br.readLine();
        int numberToSearch=Integer.parseInt(numStr);
        for (int k=0;k< array.length;k++) {
            if(array[k]==numberToSearch){
                array[k]=1;
            }
        }
        for (int k=0;k< array.length;k++) {
            if(array[k]!=1 && k<array.length-1){
                int temp=array[k];
                array[k]=array[k+1];
                array[k+1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}