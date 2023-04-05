package com.epam.course.hometask2_4;

/**
 * Creating a program to display the
 * Fibonacci series.
 *
 * @author Tatyana Nadonenko
 * @version 1.0
 * @since 27-03-2023
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int i = 1;
        int firstTerm = 0;
        int secondTerm = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}
