package hackerranktest;

import java.util.Scanner;

public class SecondLargestDigit

{

    public static void main(String []args)

    {

        int d,temp;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n=sc.nextInt();

        String n1=Integer.toString(n);

        int len=n1.length();

        int n2=Integer.parseInt(n1);

        int r[]=new int[len];

        int i=0;

        do

        {

            d=n%10;

            r[i]=d;

            n=n/10;

            i++;

}while(n>0);

        for(i=0;i<len-1;i++)

        {

for(int j=0;j<len-i-1;j++)

            {

                if(r[j]>r[j+1])

                {

                    temp=r[j];

                    r[j]=r[j+1];

                    r[j+1]=temp;

                }

            }

        }

        System.out.println("Second largest number: "+r[len-2]);

    }

}