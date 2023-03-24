package com.epam.course.hometask2;

/**
 * Task: Given an integer x, return true if x
 * is a palindrome, and false otherwise.
 * Added the ability to enter data from the
 * console and display the result on the console.
 *
 * @author Tatyana Nadonenko
 * @version 1.0
 * @since 24-03-2023
 */

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;

        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == x || reverse / 10 == x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int x = scanner.nextInt();

        if (isPalindrome(x)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }
    }
}
