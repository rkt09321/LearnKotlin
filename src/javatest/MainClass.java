package javatest;

import java.util.Arrays;

public class MainClass{
    static int [] abc= {1,2,3,4,5};
    static int [] abcd= {1,2,3,4,5};
    public static void main(String[] args) {

        System.out.println(abc.equals(abcd));
        System.out.println(Arrays.equals(abc,abcd));
       try {
           abc[1] = 30 / 0;
       }catch (Exception ex){
           System.out.println(ex);
       }

    }

}
