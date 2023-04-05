package com.epam.course.hometask2_3;

/**
 * Given a non-negative integer x, return the square
 * root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 *
 *  @author Tatyana Nadonenko
 *  @version 1.0
 *   @since 27-03-2023
 */

import java.util.Scanner;

public class Sqrt {
    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }
        int start = 1;
        int end = x;
        int res = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number:");
        int x = scanner.nextInt();

        if (x == 0) {
            System.out.println(0);
        } else {
            System.out.println(mySqrt(x));
        }
    }
}
