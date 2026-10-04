package com.practice;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (num >= 0 && num == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
