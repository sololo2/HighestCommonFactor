package com.proxy.main;

public class HighestCommonFactor {

    public int getHighestCommonFactor(int[] numbers) {
        int highestCommonFactor = numbers[0];
        for(int number:numbers)  {
            highestCommonFactor = getHighestCommonFactor(highestCommonFactor, number);
        }
        return highestCommonFactor;
    }

    public int getHighestCommonFactor(int a, int b) {
        // hcf of 2 numbers
        int highestCommonFactor = 0;
        for(int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                highestCommonFactor=i;
        }
        return highestCommonFactor;
    }

    public static void main(String[] args)    {
        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("HighestCommonFactor:: " + highestCommonFactor.getHighestCommonFactor(numbers));
    }
}