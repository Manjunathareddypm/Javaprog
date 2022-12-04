package com.Day5.DPP;

import java.util.Scanner;

public class Division {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the first number ");
         int number1 = sc.nextInt();
         System.out.println("enter the second number  ");
         int number2 = sc.nextInt();
         int quotient = number1 / number2;
         int remainder = number1 % number2;
         System.out.println("quotient for given numbers is: " +quotient);
         System.out.println("remainder for given number is: " +remainder);
    }
}
