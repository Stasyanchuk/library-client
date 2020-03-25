package ru.burdakov.library.client.api.entity;

import java.io.Serializable;

public class ReviewEntity implements Serializable {

    private Integer id;
    private Integer rating;
    private String comment;

    public ReviewEntity() {
    }

    public ReviewEntity(Integer id, Integer rating, String comment) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
