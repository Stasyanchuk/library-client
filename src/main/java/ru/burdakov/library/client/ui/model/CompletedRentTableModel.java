package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.RentEntity;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CompletedRentTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Арендатор", "Книга","Дата начала аренды", "Дата сдачи книги", "Оценка", "Отзыв"};

    private List<RentEntity> rents;

    public CompletedRentTableModel(List<RentEntity> rents) {
        this.rents = rents;
    }


    @Override
    public int getRowCount() {
        return rents.size();
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


        if (rents == null)
            return null;

        if(columnIndex == 0)
            return rents.get(rowIndex).getClient().getFirstName() + " " + rents.get(rowIndex).getClient().getLastName();
        if(columnIndex == 1)
            return rents.get(rowIndex).getBook().getName();
        if(columnIndex == 2)
            return rents.get(rowIndex).getStartDate();
        if(columnIndex == 3)
            return rents.get(rowIndex).getFinishDate();

        if(rents.get(rowIndex).getReview() == null)
            return null;

        if(columnIndex == 4)
            return rents.get(rowIndex).getReview().getRating();
        if(columnIndex == 5)
            return rents.get(rowIndex).getReview().getComment();

        return null;
    }

    public List<RentEntity> getRents() {
        return rents;
    }

    public void setRents(List<RentEntity> rents) {
        this.rents = rents;
    }

    public void addRent(RentEntity rent) {
        rents.add(rent);
        fireTableDataChanged();
    }
}
