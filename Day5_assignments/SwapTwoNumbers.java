package com.Day5.DPP;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number= ");
        int number1 = sc.nextInt();
        System.out.println("enter second number= ");
        int number2 = sc.nextInt();
        int temporary;
        temporary = number1 + number2;
        number1 = temporary-number1;
        number2 = temporary - number2;
        System.out.println("after swaping number1 and number2 is: " +number1+ " " +number2);
    }
}
