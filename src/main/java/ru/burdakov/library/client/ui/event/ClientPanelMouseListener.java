package ru.burdakov.library.client.ui.event;

import ru.burdakov.library.client.ui.frames.DetailedClientFrame;
import ru.burdakov.library.client.ui.model.ClientTableModel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClientPanelMouseListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        JTable table = (JTable) e.getSource();

        ClientTableModel tableModel = (ClientTableModel) table.getModel();

        boolean isDoubleClick= e.getClickCount() == 2;

        if(!isDoubleClick)
            return;

        DetailedClientFrame frame = new DetailedClientFrame(tableModel.getClients().get(table.getSelectedRow()));
        frame.setVisible(true);
    }
}
