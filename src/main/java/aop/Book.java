package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("War and War")
    private String name;
    @Value("Leo Tolstoy")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    @Value("1890")
    private int publication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
