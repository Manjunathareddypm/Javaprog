package com.Day5.DPP;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("given number is an even number");
        }
        else {
            System.out.println("given number is an odd number");
        }
    }
}
