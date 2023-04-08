package com.epam.course.hometask3;

public class Book {
    private int isbn;
    private String name;
    Authors author;
    Publishers publisher;
    private String publicationDate;
    private boolean paperback;

    public Book(int isbn, String name, Authors author,
                Publishers publisher, String publicationDate,
                boolean paperback) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.paperback = paperback;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public Publishers getPublisher() {
        return publisher;
    }

    public void setPublisher(Publishers publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean getPaperback() {
        return paperback;
    }

    public void setPaperback(boolean paperback) {
        this.paperback = paperback;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", publicationDate='" + publicationDate + '\'' +
                ", paperback='" + paperback + '\'' +
                '}';


    }
}