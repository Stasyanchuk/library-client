package ru.burdakov.library.client.api.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

public class BookEntity implements Serializable {

    private Long id;
    private String name;
    private String comment;
    private Long count;
    private List<AuthorEntity> authors;

    public BookEntity() {
    }

    public BookEntity(String name, String comment, Long count, List<AuthorEntity> authors) {
        this.name = name;
        this.comment = comment;
        this.count = count;
        this.authors = authors;
    }

    public BookEntity(Long id, String name, String comment, Long count, List<AuthorEntity> authors) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.count = count;
        this.authors = authors;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }

}
