package com.epam.course.hometask3;

/**
 * Hierarchy of classes: Book, Author, Publisher,
 * with the method to go through the array and
 * display books by one of the criteria
 *
 * @author Tatyana Nadonenko
 * @version 1.0
 * @since 05-04-2023
 */
public class Main {
    public static void main(String[] args) {
        Book[] arr = new Book[5];
        arr[0] = new Book("Cats", "1762415390763", "Fiona Larson", "Aster",
                "05.04.2015", "Hard");
        arr[1] = new Book("Green tomatoes", "9872563728193", "Jimmy Grey",
                "Aster", "15.03.2005", "Soft");
        arr[2] = new Book("Find your oun way", "8723561238745", "Jimmy Grey",
                "Aster", "09.12.2017", "Hard");
        arr[3] = new Book("Best summer", "9735632871902", "Lizzy Taylor", "J.Caster",
                "23.02.2019", "Soft");
        arr[4] = new Book("Story of kind", "8637289108392", "Lena Green", "J.Caster",
                "16.07.2005", "Soft");

        Authors[] arrA = new Authors[4];
        arrA[0] = new Authors("Fiona Larson", "32198-15F");
        arrA[1] = new Authors("Jimmy Grey", "84593-05J");
        arrA[2] = new Authors("Lizzy Taylor", "39044-19L");
        arrA[3] = new Authors("Lena Green", "24583-17L");

        Publishers[] arrB = new Publishers[2];
        arrB[0] = new Publishers("Aster", "A-29847", "Almaty, 94 Apple st.");
        arrB[1] = new Publishers("J.Caster", "J-89365", "Almaty, 45 Vernyy st.");


        String displayAuthor = "Jimmy Grey";
        String displayPublisher = "Aster";
        String displayName = "Cats";
        String displayPaperback = "Hard";



        for (Book value : arr) {
            if (value.getAuthor().equals(displayAuthor)) {
                System.out.println(value);
            }
        }
        System.out.println();

        for (Book value : arr) {
            if (value.getPublisher().equals(displayPublisher)) {
                System.out.println(value);
            }
        }
        System.out.println();

        for (Book book : arr) {
            if (book.getName().equals(displayName)) {
                System.out.println(book);
            }
        }
        System.out.println();

        for (Book book : arr) {
            if (book.getPaperback().equals(displayPaperback)) {
                System.out.println(book);
            }
        }
        System.out.println();

    }
}
