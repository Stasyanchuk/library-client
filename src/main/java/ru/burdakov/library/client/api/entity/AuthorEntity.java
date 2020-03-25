package ru.burdakov.library.client.api.entity;

import java.io.Serializable;
import java.util.List;

public class AuthorEntity implements Serializable {

    private Long id;
    private String name;
    private String description;
    private List<BookEntity> books;

    public AuthorEntity() {
    }

    public AuthorEntity(Long id, String name, String description, List<BookEntity> books) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
