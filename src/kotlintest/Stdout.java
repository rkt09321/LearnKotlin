package kotlintest;

import java.util.Scanner;

class Stdout{

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        String st = sc.next();
        int len =st.length();
        if(a>=0 && a<=10)
        System.out.println(a*2);
        if(len>=1 && len<=15)
        System.out.println(st);
    }

}
