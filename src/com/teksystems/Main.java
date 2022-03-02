package com.teksystems;

public class Main {

    public static void main(String[] args) {
        decimalToBinary();
        binaryToDecimal();
        decimalToBinaryShifted();
//        problemFour();
//        problemFive();
//        problemSix();
//        problemSeven();
//        problemEight();
    }

    /* Write the following integers in binary notation.
    Do not use any Java functions or online conversion applications to calculate the answer
    as this will hinder the learning process and your understanding of the concept.
    However, you may check your answers using Java methods.
    1
    8
    33
    78
    787
    33,987

     */
    public static void decimalToBinary(){
        System.out.println("In binary, the number 1 is: 0001");
        System.out.println("In binary, the number 8 is: 1000");
        System.out.println("In binary, the number 33 is: 100001");
        System.out.println("In binary, the number 78 is: 1001110");
        System.out.println("In binary, the number 787 is: 1100010011");
        System.out.println("In binary, the number 33,987 is: 1000010011000011");
    }

    /*Convert the following binary numbers to decimal notation.
    0010
    1001
    0011 0100
    0111 0010
    0010 0001 1111
    0010 1100 0110 0111
     */
    public static void binaryToDecimal(){
        System.out.println("0010 converted to decimal is: 2");
        System.out.println("1001 converted to decimal is: 9");
        System.out.println("0011 0100 converted to decimal is: 52");
        System.out.println("0111 0010 converted to decimal is: 114");
        System.out.println("0010 0001 1111 converted to decimal is: 543");
        System.out.println("0010 1100 0110 0111 converted to decimal is: 11,367");
    }


    /* Write a program that declares an integer a variable x and assigns the value 2 to it
    and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
    Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
    Before printing the results, write a comment with the predicted decimal value and binary string.
    Now, print out x in decimal form and in binary notation.
     */
    public static void decimalToBinaryShifted(){
        int x = 9;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        //18, 10010
        System.out.println("left shifted value in decimal: " + x);
        System.out.println("left shifted value in binary: " + Integer.toBinaryString(x));

        int y = 17;
        System.out.println(Integer.toBinaryString(y));
        y = y << 1;
        //34, 100010
        System.out.println("left shifted value in decimal: " + y);
        System.out.println("left shifted value in binary: " + Integer.toBinaryString(y));

        int z = 88;
        System.out.println(Integer.toBinaryString(z));
        z = z << 1;
        //176, 10110000
        System.out.println("left shifted value in decimal: " + z);
        System.out.println("left shifted value in binary: " + Integer.toBinaryString(z));
    }



}