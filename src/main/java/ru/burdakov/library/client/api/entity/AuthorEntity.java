package ru.burdakov.library.client.api.entity;

public class AuthorEntity {

    private Long id;
    private String name;

    public AuthorEntity() {
    }

    public AuthorEntity(Long id, String name) {
        this.id = id;
        this.name = name;
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
}