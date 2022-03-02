package com.teksystems;

public class Main {

    public static void main(String[] args) {
        decimalToBinary();
        binaryToDecimal();
        decimalToBinaryLeftShifted();
        decimalToBinaryRightShifted();
        problemFive();
        postfixIncrementIncrease();
        incrementThreeWays();
        problemEight();
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
    public static void decimalToBinary() {
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
    public static void binaryToDecimal() {
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
    public static void decimalToBinaryLeftShifted() {
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

    /* Write a program that declares a variable x and assigns 150 to it
    and prints out the binary string version of the number.
    Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    Write a comment indicating what you anticipate the decimal and binary values to be.
    Now print the value of x and the binary string.
    225
    1555
    32456
     */
    public static void decimalToBinaryRightShifted() {
        int a = 225;
        System.out.println(Integer.toBinaryString(a));
        a = a >> 1;
        //112, 1110000
        System.out.println("right-shifted value in decimal: " + a);
        System.out.println("right-shifted value in binary: " + Integer.toBinaryString(a));

        int b = 1555;
        System.out.println(Integer.toBinaryString(b));
        b = b >> 1;
        //777, 1100001001
        System.out.println("right-shifted value in decimal: " + b);
        System.out.println("right-shifted value in binary: " + Integer.toBinaryString(b));

        int c = 32456;
        System.out.println(Integer.toBinaryString(b));
        c = c >> 1;
        //16228, 11111101100100
        System.out.println("right-shifted value in decimal: " + c);
        System.out.println("right-shifted value in binary: " + Integer.toBinaryString(c));
    }

    /* Write a program that declares 3 int variables x, y, and z.
    Assign 7 to x and 17 to y.
    Write a comment that indicates what you predict will be
    the result of the bitwise & operation on x and y.
    Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.

    Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
    As before, write a comment that indicates what you predict the values to be before printing them out.
     */
    public static void problemFive() {
        int x = 7;
        int y = 17;
        int z = x&y;
        //bitwise operation of x & y result: 00001
        //decimal: 1
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        int a = x|y;
        //bitwise operation of x & y result: 10111
        //decimal: 23
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
    }

    /* Write a program that declares an integer variable, assigns a number,
    and uses a postfix increment operator to increase the value.
    Print the value before and after the increment operator.
     */
    public static void postfixIncrementIncrease() {
        int x = 5;
        System.out.println(x);
        x += x;
        System.out.println("Post-increment: " + x);
    }

    /*Write a program that demonstrates at least 3 ways to increment a variable by 1
    and does this multiple times.
    Assign a value to an integer variable, print it, increment by 1, print it again,
    increment by 1, and then print again.
     */
    public static void incrementThreeWays() {
        int x = 1;
        x += 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
    }

    /* Write a program that declares 2 integer variables, x, and y,
    and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y and print the result.
    Notice the value of the sum (should be 14).
    Now change the increment operator to postfix (x++) and re-run the program.
    Notice what the value of sum is.
    The first configuration incremented x and then calculated the sum
    while the second configuration calculated the sum and then incremented x.
     */
    public static void problemEight() {
        int x = 5;
        int y = 8;
        //previously tried: int sum = ++x + y;
        int sum = x++ + y;
        System.out.println(sum);
    }
}
