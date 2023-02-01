package com.bridgelabz.workshop;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program \n Enter a number : ");
        int num = scanner.nextInt();

        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}
