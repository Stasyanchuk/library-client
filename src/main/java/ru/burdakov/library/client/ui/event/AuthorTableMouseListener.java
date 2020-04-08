package ru.burdakov.library.client.ui.event;

import ru.burdakov.library.client.ui.frames.DetailedAuthorFrame;
import ru.burdakov.library.client.ui.frames.DetailedClientFrame;
import ru.burdakov.library.client.ui.model.AuthorTableModel;
import ru.burdakov.library.client.ui.model.ClientTableModel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AuthorTableMouseListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        JTable table = (JTable) e.getSource();

        AuthorTableModel tableModel = (AuthorTableModel) table.getModel();

        boolean isDoubleClick= e.getClickCount() == 2;

        if(!isDoubleClick)
            return;

        DetailedAuthorFrame frame = new DetailedAuthorFrame(tableModel.getAuthors().get(table.getSelectedRow()));
        frame.setVisible(true);
    }
}
