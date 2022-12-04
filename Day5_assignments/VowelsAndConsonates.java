package com.Day5.DPP;

import java.util.Scanner;

public class VowelsAndConsonates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char letter = sc.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
                System.out.println("entered character is a vowel ");
            }
        else
        {
            System.out.println("enter character is a consonant ");
        }
    }
}


