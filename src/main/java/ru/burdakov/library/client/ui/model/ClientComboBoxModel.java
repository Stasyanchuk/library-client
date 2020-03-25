package ru.burdakov.library.client.ui.model;

import ru.burdakov.library.client.api.entity.ClientEntity;


import javax.swing.*;

public class ClientComboBoxModel extends DefaultComboBoxModel<ClientEntity> {

    public ClientComboBoxModel(ClientEntity[] clients) {
        super(clients);
    }

    @Override
    public ClientEntity getSelectedItem() {
        return (ClientEntity) super.getSelectedItem();
    }

}
