package com.epam.course.hometask2_5;

/**
 * Task: show 'fizz' if a number divisible by 3,
 * show 'buzz' if a number divisible by 5,
 * show 'fizz-buzz' if a number divisible by both 3 and 5.
 *
 * @author Tatyana Nadonenko
 * @version 1.0
 * @since 27-03-2023
 */

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        int i;

        for (i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("fizz-bazz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
