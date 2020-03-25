package ru.burdakov.library.client.api.entity;

import java.io.Serializable;

public class ClientEntity implements Serializable {

    private Integer id;
    private String firstName;
    private String lastName;
    private Long passport;
    private Long age;

    public ClientEntity() {
    }

    public ClientEntity(Integer id, String firstName, String lastName, Long passport, Long age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPassport() {
        return passport;
    }

    public void setPassport(Long passport) {
        this.passport = passport;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
