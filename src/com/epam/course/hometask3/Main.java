package com.epam.course.hometask3;

/**
 * Hierarchy of classes: Book, Author, Publisher,
 * with the method to go through the array and
 * display books by one of the criteria
 *
 * @author Tatyana Nadonenko
 * @version 1.1
 * @since 08-04-2023
 */
public class Main {
    public static void main(String[] args) {
        Authors author1 = new Authors("Fiona Larson", 32198);
        Authors author2 = new Authors("Jimmy Grey", 84593);
        Authors author3 = new Authors("Lizzy Taylor", 3904);
        Authors author4 = new Authors("Lena Green", 24583);

        Publishers publisher1 = new Publishers("Aster", 29847,
                "Almaty, 94 Apple st.");
        Publishers publisher2 = new Publishers("J.Caster", 89365,
                "Almaty, 45 Vernyy st.");

        Book[] book = new Book[5];
        book[0] = new Book(1762415, "Cats", author1,
                publisher1, "05.04.2015", false);
        book[1] = new Book(9872563, "Green tomatoes", author2,
                publisher1, "15.03.2005", true);
        book[2] = new Book(8723561, "Find your oun way", author2,
                publisher1, "09.12.2017", false);
        book[3] = new Book(9735632, "Best summer", author3,
                publisher2, "23.02.2019", true);
        book[4] = new Book(8637289, "Story of kind", author4,
                publisher2, "16.07.2005", true);

        displayByCriteria(book, "Cats");
        displayByCriteria(book, author2);
        displayByCriteria(book, 8637289);
        displayByCriteria(book, publisher1);
        displayByCriteria(book, true);
    }
    public static void displayByCriteria(Book[] book, String name) {
        System.out.println("Display books by name:");
        for (Book value : book) {
            if (value.getName().equals(name)) {
                System.out.println(value);
            }
        }
        System.out.println();
    }
    public static void displayByCriteria(Book[] book, Authors authors) {
        System.out.println("Display books by author:");
        for (Book value : book) {
            if (value.getAuthor().equals(authors)) {
                System.out.println(value);
            }
        }
        System.out.println();
    }
    public static void displayByCriteria(Book[] book, int isbn) {
        System.out.println("Display books by ISBN:");
        for (Book value : book) {
            if (value.getIsbn() == isbn) {
                System.out.println(value);
            }
        }
        System.out.println();
    }
    public static void displayByCriteria(Book[] book, Publishers publishers) {
        System.out.println("Display books by Publishers:");
        for (Book value : book) {
            if (value.getPublisher().equals(publishers)) {
                System.out.println(value);
            }
        }
        System.out.println();
    }
    public static void displayByCriteria(Book[] book, boolean paperback) {
        System.out.println("Display books by Paperback:");
        for (Book value : book) {
            if (value.getPaperback() == paperback) {
                System.out.println(value);
            }
        }
        System.out.println();
    }



}
