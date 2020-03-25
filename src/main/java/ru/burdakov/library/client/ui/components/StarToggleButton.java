package ru.burdakov.library.client.ui.components;

import javax.swing.*;

public class StarToggleButton extends JToggleButton {

    public StarToggleButton() {
        initButton();
    }

    private void initButton(){
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/burdakov/library/client/ui/panel/black-star.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(32, 32));
        setMinimumSize(new java.awt.Dimension(32, 32));
        setPreferredSize(new java.awt.Dimension(32, 32));
    }


}
