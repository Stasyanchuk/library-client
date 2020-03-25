package ru.burdakov.library.client.api.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

public class BookEntity implements Serializable {

    private Integer id;
    private String name;
    private Integer count;
    private Integer year;
    private List<AuthorEntity> authors;

    public BookEntity() {
    }

    public BookEntity(String name, Integer year, Integer count, List<AuthorEntity> authors) {
        this.name = name;
        this.year = year;
        this.count = count;
        this.authors = authors;
    }

    public BookEntity(Integer id, String name, Integer year, Integer count, List<AuthorEntity> authors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.count = count;
        this.authors = authors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }

}
