package com.aj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalNumber = input.nextInt();

        System.out.print(getBinary(decimalNumber));
    }

    // Method that converts binary number to decimal number using recursion
    static int getBinary(int decimalNumber) {
        if (decimalNumber == 0)
            return 0;
        else
            return (decimalNumber % 2 + 10 * getBinary(decimalNumber / 2));
    }
}
