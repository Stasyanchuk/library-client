package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.AuthorEntity;

import javax.swing.*;
import java.util.List;

public class AuthorListModel extends AbstractListModel<AuthorEntity> {

    List<AuthorEntity> authors;

    public AuthorListModel(List<AuthorEntity> authors) {
        this.authors = authors;
    }

    @Override
    public int getSize() {
        return authors.size();
    }

    @Override
    public AuthorEntity getElementAt(int index) {
        return authors.get(index);
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }
}
