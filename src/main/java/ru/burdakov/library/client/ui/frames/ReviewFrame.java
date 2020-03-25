/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.burdakov.library.client.ui.frames;

import ru.burdakov.library.client.api.entity.RentEntity;
import ru.burdakov.library.client.api.entity.ReviewEntity;
import ru.burdakov.library.client.api.enums.RentStates;
import ru.burdakov.library.client.api.service.RequestService;
import ru.burdakov.library.client.ui.panel.RentPanel;

/**
 *
 * @author klavi
 */
public class ReviewFrame extends javax.swing.JFrame {

    private Integer rating;
    private RentPanel rentPanel;

    /**
     * Creates new form ReviewFrame
     * @param rentPanel
     */
    public ReviewFrame(RentPanel rentPanel) {
        this.rentPanel = rentPanel;
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        ratingButton1 = new javax.swing.JToggleButton();
        ratingButton2 = new javax.swing.JToggleButton();
        ratingButton3 = new javax.swing.JToggleButton();
        ratingButton4 = new javax.swing.JToggleButton();
        ratingButton5 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Оценка:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel1, gridBagConstraints);

        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        ratingButton1.setMaximumSize(new java.awt.Dimension(32, 32));
        ratingButton1.setMinimumSize(new java.awt.Dimension(32, 32));
        ratingButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        ratingButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingButton1ItemStateChanged(evt);
            }
        });
        ratingButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ratingButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ratingButton1MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(ratingButton1, gridBagConstraints);

        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        ratingButton2.setMaximumSize(new java.awt.Dimension(32, 32));
        ratingButton2.setMinimumSize(new java.awt.Dimension(32, 32));
        ratingButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        ratingButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingButton2ItemStateChanged(evt);
            }
        });
        ratingButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ratingButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ratingButton2MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(ratingButton2, gridBagConstraints);

        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        ratingButton3.setMaximumSize(new java.awt.Dimension(32, 32));
        ratingButton3.setMinimumSize(new java.awt.Dimension(32, 32));
        ratingButton3.setPreferredSize(new java.awt.Dimension(32, 32));
        ratingButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingButton3ItemStateChanged(evt);
            }
        });
        ratingButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ratingButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ratingButton3MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(ratingButton3, gridBagConstraints);

        ratingButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        ratingButton4.setMaximumSize(new java.awt.Dimension(32, 32));
        ratingButton4.setMinimumSize(new java.awt.Dimension(32, 32));
        ratingButton4.setPreferredSize(new java.awt.Dimension(32, 32));
        ratingButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingButton4ItemStateChanged(evt);
            }
        });
        ratingButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ratingButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ratingButton4MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(ratingButton4, gridBagConstraints);

        ratingButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        ratingButton5.setMaximumSize(new java.awt.Dimension(32, 32));
        ratingButton5.setMinimumSize(new java.awt.Dimension(32, 32));
        ratingButton5.setPreferredSize(new java.awt.Dimension(32, 32));
        ratingButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingButton5ItemStateChanged(evt);
            }
        });
        ratingButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ratingButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ratingButton5MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(ratingButton5, gridBagConstraints);

        jLabel2.setText("Отзыв:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        commentArea.setColumns(20);
        commentArea.setRows(5);
        jScrollPane1.setViewportView(commentArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveButton);

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ratingButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton1MouseEntered
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png"))); // NOI18N
    }//GEN-LAST:event_ratingButton1MouseEntered

    private void ratingButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton1MouseExited
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
    }//GEN-LAST:event_ratingButton1MouseExited

    private void ratingButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton2MouseEntered
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
    }//GEN-LAST:event_ratingButton2MouseEntered

    private void ratingButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton2MouseExited
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
    }//GEN-LAST:event_ratingButton2MouseExited

    private void ratingButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton3MouseEntered
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
    }//GEN-LAST:event_ratingButton3MouseEntered

    private void ratingButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton3MouseExited
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
    }//GEN-LAST:event_ratingButton3MouseExited

    private void ratingButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton4MouseEntered
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
    }//GEN-LAST:event_ratingButton4MouseEntered

    private void ratingButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton4MouseExited
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
    }//GEN-LAST:event_ratingButton4MouseExited

    private void ratingButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton5MouseEntered
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
        ratingButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
    }//GEN-LAST:event_ratingButton5MouseEntered

    private void ratingButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingButton5MouseExited
        ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
        ratingButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
    }//GEN-LAST:event_ratingButton5MouseExited

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setRating(rating);
        reviewEntity.setComment(commentArea.getText());
        RentEntity selectionRent = rentPanel.getSelectionActiveRent();
        selectionRent.setReview(reviewEntity);
        selectionRent.setStates(RentStates.COMPLETED);
        RequestService.deleteRent(selectionRent.getBook().getId(), selectionRent.getClient().getId(), reviewEntity);
        rentPanel.removeSelectionActiveRent(rentPanel.getActiveTable().getSelectedRow());
        rentPanel.addCompletedRent(selectionRent);
        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed



    private void ratingButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingButton1ItemStateChanged
        if(ratingButton1.isSelected()){
            ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/star.png")));
            rating = 1;
        } else {
            ratingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png")));
            rating = null;
        }
    }//GEN-LAST:event_ratingButton1ItemStateChanged

    private void ratingButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingButton2ItemStateChanged
        if(ratingButton2.isSelected()){
            ratingButton2MouseEntered(null);
            ratingButton1.setSelected(true);
            rating = 2;
        } else {
            ratingButton2MouseExited(null);
            rating = null;
        }
    }//GEN-LAST:event_ratingButton2ItemStateChanged

    private void ratingButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingButton3ItemStateChanged
        if(ratingButton3.isSelected()){
            ratingButton3MouseEntered(null);
            ratingButton1.setSelected(true);
            ratingButton2.setSelected(true);
            rating = 3;
        } else {
            ratingButton3MouseExited(null);
            rating = null;
        }
    }//GEN-LAST:event_ratingButton3ItemStateChanged

    private void ratingButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingButton4ItemStateChanged
        if(ratingButton4.isSelected()){
            ratingButton4MouseEntered(null);
            ratingButton1.setSelected(true);
            ratingButton2.setSelected(true);
            ratingButton3.setSelected(true);
            rating = 4;
        } else {
            ratingButton4MouseExited(null);
            rating = null;
        }
    }//GEN-LAST:event_ratingButton4ItemStateChanged

    private void ratingButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingButton5ItemStateChanged
        if(ratingButton5.isSelected()){
            ratingButton5MouseEntered(null);
            ratingButton1.setSelected(true);
            ratingButton2.setSelected(true);
            ratingButton3.setSelected(true);
            ratingButton4.setSelected(true);
            rating = 5;
        } else {
            ratingButton5MouseExited(null);
            rating = null;
        }
    }//GEN-LAST:event_ratingButton5ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea commentArea;
    private javax.swing.JToggleButton ratingButton1;
    private javax.swing.JToggleButton ratingButton2;
    private javax.swing.JToggleButton ratingButton3;
    private javax.swing.JToggleButton ratingButton4;
    private javax.swing.JToggleButton ratingButton5;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
