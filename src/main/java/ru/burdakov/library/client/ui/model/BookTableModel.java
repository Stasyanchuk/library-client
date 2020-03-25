package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.AuthorEntity;
import ru.burdakov.library.client.api.entity.BookEntity;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Название", "Автор(ы)", "Год выпуска", "Количество"};

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
            return books.get(i).getYear();
        if (i1 == 3)
            return books.get(i).getCount();

        return null;
    }

    public void addBook(BookEntity book) {
        books.add(book);
        fireTableDataChanged();
    }

    public void updateBook(BookEntity book, int index){
        books.set(index, book);
        fireTableDataChanged();
    }

    public void minusBook(Integer bookId){
        for (BookEntity book : books) {
            if (book.getId().equals(bookId)) {
                book.setCount(book.getCount() - 1);
                break;
            }
        }
        fireTableDataChanged();
    }

    public BookEntity getBook(Long id){
        return books.stream().filter(a-> a.getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public void removeBook(int index){
        this.books.remove(index);
        fireTableDataChanged();
    }

    private String fabricAuthors(List<AuthorEntity> authors) {
        if (authors.size() == 0)
            return "";

        StringBuilder a = new StringBuilder();
        if (authors.size() == 1)
            a.append(authors.get(0).getName());
        else {
            for (int i = 0; i < authors.size() - 1; i++) {
                a.append(authors.get(i).getName() + ", ");
            }
            a.append(authors.get(authors.size() - 1).getName());
        }
        return a.toString();
    }
}
