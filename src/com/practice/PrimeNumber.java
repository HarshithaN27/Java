package com.practice;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = num >= 2;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
