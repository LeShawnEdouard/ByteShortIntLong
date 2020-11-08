package com.company;

public class ByteShortInLong {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);  // "Integer" is part of the wrapper classes
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // The result of this is called an overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); // The result of this is called an underflow
        // It's important to use the right data type to store larger numbers

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // A smaller data type takes up less space and can be quicker to access. "Performance"


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L; // When using the long primitive type you have to add the letter "L" which tells the PC it's a long value
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // Initially, there was an error because Java was treating
        // everything in the parenthesis as an int. When adding "(byte) it converts the number into a byte. This
        // is called "casting".

        short myNewShortValue = (short) (myMinShortValue / 2); // Another example of casting <



    }
}
