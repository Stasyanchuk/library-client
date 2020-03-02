package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.AuthorEntity;
import ru.burdakov.library.client.api.entity.BookEntity;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BookTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Название", "Автор(ы)", "Описание", "Оценка"};

    List<BookEntity> books;

    public BookTableModel() {
        books = new ArrayList<>();
    }

    public BookTableModel(List<BookEntity> books) {
        this.books = books;
    }

    @Override
    public int getRowCount() {
        return books.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }

    @Override
    public Object getValueAt(int i, int i1) {

        if (books == null)
            return null;

        if (i1 == 0)
            return books.get(i).getName();
        if (i1 == 1)
            if (books.get(i).getAuthors() != null)
                return fabricAuthors(books.get(i).getAuthors());
        if (i1 == 2)
            return books.get(i).getComment();
        if (i1 == 3)
            return books.get(i).getCount();

        return null;
    }

    public void addBook(BookEntity book) {
        books.add(book);
        fireTableDataChanged();
    }

    private String fabricAuthors(List<AuthorEntity> authors) {
        StringBuilder a = new StringBuilder();

        authors.forEach(auth -> a.append(auth.getName() + " "));
        return a.toString();
    }
}
