package ru.lookBag;

public class Book {
    String yearPublication;
    String publisherName;
    Author authorName;

    public Book(String yearPublication, String publisherName, Author authorName){
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.yearPublication = yearPublication;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public void readBook(){
        System.out.println("Год публикации книги: " + yearPublication);
        System.out.println("Название книги: " + publisherName);
        System.out.println("Автор: " + authorName.getFullName());
    }

    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString(){
        return authorName.getFullName() + " | " + publisherName + " | " + yearPublication;
    }

    @Override
    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        if(this.authorName.equals(book.authorName)){
            return this.publisherName.equals(book.publisherName);
        }
        return false;
    }
}
