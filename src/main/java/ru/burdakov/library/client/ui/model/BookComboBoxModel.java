package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.BookEntity;

import javax.swing.*;

public class BookComboBoxModel extends DefaultComboBoxModel<BookEntity> {

    public BookComboBoxModel(BookEntity[] books) {
        super(books);
    }

    @Override
    public BookEntity getSelectedItem() {
        return (BookEntity) super.getSelectedItem();
    }
}
