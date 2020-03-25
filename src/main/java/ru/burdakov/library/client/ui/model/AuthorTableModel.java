package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.AuthorEntity;
import ru.burdakov.library.client.api.entity.BookEntity;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AuthorTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Имя", "Описание"};
    private List<AuthorEntity> authors;

    public AuthorTableModel(List<AuthorEntity> authors) {
        this.authors = authors;
    }

    @Override
    public int getRowCount() {
        return authors.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (authors == null)
            return null;

        if(columnIndex == 0)
            return authors.get(rowIndex).getName();
        if(columnIndex == 1)
            return authors.get(rowIndex).getDescription();

        return null;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void removeAuthor(int index){
        authors.remove(index);
        fireTableDataChanged();
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }

    public void addAuthor(AuthorEntity author) {
        authors.add(author);
        fireTableDataChanged();
    }

    public void updateAuthor(AuthorEntity author, int index){
        authors.set(index, author);
        fireTableDataChanged();
    }
}
