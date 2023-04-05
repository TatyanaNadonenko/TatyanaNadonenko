package com.epam.course.hometask2_2;

/**
 * Task: Given a string s consisting of words
 * and spaces, return the length of the last
 * word in the string.
 *
 * * @author Tatyana Nadonenko
 *  * @version 1.0
 *  * @since 27-03-2023
 */

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        int lastWordLength = 0;

        if (s.length() == 1) {
            return 1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lastWordLength++;
            } else if (lastWordLength != 0 && s.charAt(i) == ' ') {
                return lastWordLength;
            }
        }
        return lastWordLength;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the sentence:");
        String s = scanner.nextLine();

        System.out.println(lengthOfLastWord(s));
    }
}

