package ru.burdakov.library.client.api.entity;

import ru.burdakov.library.client.api.enums.RentStates;

import java.io.Serializable;
import java.time.LocalDate;

public class RentEntity implements Serializable {

    private Integer id;
    private LocalDate startDate;
    private LocalDate finishDate;
    private LocalDate deadlineDate;
    private ReviewEntity review;
    private BookEntity book;
    private RentStates states;
    private ClientEntity client;

    public RentEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public ReviewEntity getReview() {
        return review;
    }

    public void setReview(ReviewEntity review) {
        this.review = review;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public RentStates getStates() {
        return states;
    }

    public void setStates(RentStates states) {
        this.states = states;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }
}
