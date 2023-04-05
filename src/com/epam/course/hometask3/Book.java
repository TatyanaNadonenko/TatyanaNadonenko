package com.epam.course.hometask3;

public class Book {
    protected String name;


    public Book (String name) {
        this.name = name;
    }

    private String isbn;
    private String author;
    private String publisher;
    private String publicationDate;
    private  String paperback;

    public Book(String name, String isbn, String author,
                String publisher, String publicationDate,
                String paperback) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.paperback = paperback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPaperback() {
        return paperback;
    }

    public void setPaperback(String paperback) {
        this.paperback = paperback;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", paperback='" + paperback + '\'' +
                '}';
    }


}
