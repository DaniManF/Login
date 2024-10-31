package com.mycompany.practica3m7;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author danim
 */
public class ExitButton extends MouseAdapter{
    private JPanel panel;
    
    
    public ExitButton(JPanel panel) {
        this.panel = panel;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    
    @Override
    public void mouseEntered(MouseEvent evt) {
        panel.setBackground(new Color(255, 100, 100));
    }

    
    @Override
    public void mouseExited(MouseEvent evt) {
        panel.setBackground(new Color(255, 0, 0));
    }
    
}
