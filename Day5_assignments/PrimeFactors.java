package com.Day5.DPP;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 2; i>0; i++){
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
    }
        }
    }

