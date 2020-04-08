package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.ClientEntity;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ClientTableModel extends AbstractTableModel {

    private String[] header = new String[]{"Фамилия", "Имя", "Паспорт", "Дата рождения"};

    private List<ClientEntity> clients;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public ClientTableModel(List<ClientEntity> clients) {
        this.clients = clients;
    }

    @Override
    public int getRowCount() {
        return clients.size();
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

        if(clients== null || clients.size() == 0)
            return null;

        if(columnIndex == 0)
            return clients.get(rowIndex).getFirstName();
        if(columnIndex == 1)
            return clients.get(rowIndex).getLastName();
        if(columnIndex == 2)
            return clients.get(rowIndex).getPassport();
        if(columnIndex == 3)
            return sdf.format(new Date(clients.get(rowIndex).getAge()));

        return null;
    }

    public List<ClientEntity> getClients() {
        return clients;
    }

    public void removeClient(int index){
        clients.remove(index);
        fireTableDataChanged();
    }

    public void setClients(List<ClientEntity> clients) {
        this.clients = clients;
        fireTableDataChanged();
    }

    public void addClient(ClientEntity client){
        clients.add(client);
        fireTableDataChanged();
    }

    public void updateClient(ClientEntity client, int index){
        clients.set(index, client);
        fireTableDataChanged();
    }
}
