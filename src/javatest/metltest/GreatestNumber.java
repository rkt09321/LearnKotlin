package javatest.metltest;

import java.util.Arrays;

public class GreatestNumber {
    public static void main(String[] args) {
        getLargestNumber("6548923");
    }

    private static void getLargestNumber(String data) {
        char[] digits = String.valueOf(data).toCharArray();
        Arrays.sort(digits);
        String graetestNumber = String.valueOf(digits);
        StringBuilder ret = new StringBuilder(graetestNumber).reverse();
//        for (int i = digits.length - 1; i >= 0; i--) {
//            graetestNumber += digits[i];
//        }
        System.out.println(ret);

    }

}
