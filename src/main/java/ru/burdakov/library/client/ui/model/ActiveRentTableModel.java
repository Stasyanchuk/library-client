package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.RentEntity;
import ru.burdakov.library.client.api.entity.ReviewEntity;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ActiveRentTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Арендатор", "Книга", "Дата аренды", "Дата окончания аренды"};

    private List<RentEntity> rents;

    public ActiveRentTableModel(List<RentEntity> rents) {
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
            return rents.get(rowIndex).getDeadlineDate();

        return null;
    }

    public List<RentEntity> getRents() {
        return rents;
    }

    public void setRents(List<RentEntity> rents) {
        this.rents = rents;
    }

    public void addRent(RentEntity rent){
        this.rents.add(rent);
        fireTableDataChanged();
    }

    public void removeRent(int index){
        this.rents.remove(index);
        fireTableDataChanged();
    }
}
