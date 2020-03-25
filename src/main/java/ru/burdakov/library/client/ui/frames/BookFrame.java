/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.burdakov.library.client.ui.frames;

import org.jdesktop.swingx.JXDatePicker;
import ru.burdakov.library.client.api.entity.AuthorEntity;
import ru.burdakov.library.client.api.entity.BookEntity;
import ru.burdakov.library.client.api.service.RequestService;
import ru.burdakov.library.client.ui.model.AuthorListModel;
import ru.burdakov.library.client.ui.panel.BookPanel;
import ru.burdakov.library.client.ui.util.Action;

import javax.swing.*;
import java.awt.*;

/**
 * @author burdakov
 */
public class BookFrame extends javax.swing.JFrame {

    private BookEntity book;
    private BookPanel bookPanel;
    private Action action;

    private AuthorListModel authorListModel;

    /**
     * Creates new form BookFrame
     */
    public BookFrame(BookEntity book, BookPanel panel) {
        this.book = book;
        this.bookPanel = panel;
        this.authorListModel = new AuthorListModel(RequestService.getAuthors());
        this.action = Action.EDIT;
        setLocationRelativeTo(null);
        initComponents();
        initModel();
        initField();
    }

    public BookFrame(BookPanel panel) {
        this.bookPanel = panel;
        this.authorListModel = new AuthorListModel(RequestService.getAuthors());
        this.action = Action.ADD;
        this.book = new BookEntity();
        setLocationRelativeTo(null);
        initComponents();
        initModel();
    }

    private void initField() {
        nameTextFeild.setText(book.getName());
        countSpinner.setValue(book.getCount());
        yearSpinner.setValue(book.getYear());

        int[] selectedIndexes = new int[book.getAuthors().size()];
        for (int i = 0; i < book.getAuthors().size(); i++) {
            for (int j = 0; j < authorListModel.getSize(); j++) {
                if (book.getAuthors().get(i).getId().equals(authorListModel.getAuthors().get(j).getId())) {
                    selectedIndexes[i] = j;
                    break;
                }
            }
        }

        authorList.setSelectedIndices(selectedIndexes);
    }

    private void initModel() {
        authorList.setModel(authorListModel);
        authorList.setCellRenderer(new ObjectCellRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        propertiesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextFeild = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yearSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        countSpinner = new javax.swing.JSpinner();
        buttonPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Новая книга");
        setMinimumSize(new java.awt.Dimension(361, 137));

        jPanel1.setLayout(new java.awt.BorderLayout());

        propertiesPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Название книги:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        propertiesPanel.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        propertiesPanel.add(nameTextFeild, gridBagConstraints);

        jLabel2.setText("Год издания:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        propertiesPanel.add(jLabel2, gridBagConstraints);

        yearSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1970), null, null, Integer.valueOf(1)));
        yearSpinner.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        propertiesPanel.add(yearSpinner, gridBagConstraints);

        jLabel3.setText("Автор(ы):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        propertiesPanel.add(jLabel3, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(258, 140));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(258, 140));

        authorList.setMaximumSize(new java.awt.Dimension(1000, 80));
        authorList.setPreferredSize(new java.awt.Dimension(100, 80));
        jScrollPane1.setViewportView(authorList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        propertiesPanel.add(jScrollPane1, gridBagConstraints);

        jLabel4.setText("Количество штук:");
        jLabel4.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        propertiesPanel.add(jLabel4, gridBagConstraints);

        countSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), null, null, Integer.valueOf(1)));
        countSpinner.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        propertiesPanel.add(countSpinner, gridBagConstraints);

        jPanel1.add(propertiesPanel, java.awt.BorderLayout.CENTER);

        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(saveButton);

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(cancelButton);

        jPanel1.add(buttonPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        book.setName(nameTextFeild.getText());
        book.setCount((Integer) countSpinner.getValue());
        book.setAuthors(authorList.getSelectedValuesList());
        book.setYear((Integer) yearSpinner.getValue());
        if (action.equals(Action.ADD))
            bookPanel.addBook(RequestService.addBook(book));
        else {
            RequestService.updateBook(book);
            bookPanel.updateBook(book, bookPanel.getTable().getSelectedRow());
        }
        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList authorList;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JSpinner countSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextFeild;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables

    private static class ObjectCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel component = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            component.setText(((AuthorEntity) value).getName());
            return component;
        }
    }
}
