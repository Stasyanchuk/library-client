/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.burdakov.library.client.ui.panel;

import ru.burdakov.library.client.api.entity.AuthorEntity;
import ru.burdakov.library.client.api.service.RequestService;
import ru.burdakov.library.client.ui.event.AuthorTableMouseListener;
import ru.burdakov.library.client.ui.frames.AuthorFrame;
import ru.burdakov.library.client.ui.model.AuthorTableModel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author klavi
 */
public class AuthorPanel extends javax.swing.JPanel {

    private AuthorTableModel tableModel;

    private JTable table = new JTable();

    /**
     * Creates new form AuthorPanel
     */
    public AuthorPanel() {
        initComponents();
        tableModel = new AuthorTableModel(RequestService.getAuthors());
        initTable();
    }

    private void initTable(){
        table.setModel(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new AuthorTableMouseListener());

        tablePanel.add(table);
        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        buttonPanel.setLayout(new javax.swing.BoxLayout(buttonPanel, javax.swing.BoxLayout.X_AXIS));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/add.png"))); // NOI18N
        addButton.setToolTipText("Добавить автора");
        addButton.setMaximumSize(new java.awt.Dimension(32, 32));
        addButton.setMinimumSize(new java.awt.Dimension(32, 32));
        addButton.setPreferredSize(new java.awt.Dimension(32, 32));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(addButton);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/delete.png"))); // NOI18N
        deleteButton.setMaximumSize(new java.awt.Dimension(32, 32));
        deleteButton.setMinimumSize(new java.awt.Dimension(32, 32));
        deleteButton.setPreferredSize(new java.awt.Dimension(32, 32));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteButton);

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/edit.png"))); // NOI18N
        editButton.setMaximumSize(new java.awt.Dimension(32, 32));
        editButton.setMinimumSize(new java.awt.Dimension(32, 32));
        editButton.setPreferredSize(new java.awt.Dimension(32, 32));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(editButton);

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/update.png"))); // NOI18N
        updateButton.setMaximumSize(new java.awt.Dimension(32, 32));
        updateButton.setMinimumSize(new java.awt.Dimension(32, 32));
        updateButton.setPreferredSize(new java.awt.Dimension(32, 32));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(updateButton);

        add(buttonPanel, java.awt.BorderLayout.NORTH);

        tablePanel.setLayout(new java.awt.BorderLayout());
        add(tablePanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AuthorFrame authorFrame = new AuthorFrame(this);
        authorFrame.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        RequestService.deleteAuthor(tableModel.getAuthors().get(table.getSelectedRow()).getId());
        tableModel.removeAuthor(table.getSelectedRow());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        AuthorFrame authorFrame = new AuthorFrame(this, tableModel.getAuthors().get(table.getSelectedRow()));
        authorFrame.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        tableModel.setAuthors(RequestService.getAuthors());
    }//GEN-LAST:event_updateButtonActionPerformed

    public void addAuthor(AuthorEntity author){
        tableModel.addAuthor(author);
    }

    public void updateAuthor(AuthorEntity author,int index){
        tableModel.updateAuthor(author, index);
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
