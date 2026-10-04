package com.practice;

import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int temp = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (num >= 0 && sum == num) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }
    }
