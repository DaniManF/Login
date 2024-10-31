package com.mycompany.practica3m7;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
/**
 *
 * @author danim
 */
public class UserText extends FocusAdapter {

    private JTextField textField;
    private String defaultText;
    private Color defaultColor;

    public UserText(JTextField textField, String defaultText, Color defaultColor) {
        this.textField = textField;
        this.defaultText = defaultText;
        this.defaultColor = defaultColor;
        this.textField.setForeground(defaultColor);
        this.textField.setText(defaultText);
    }

    
    @Override
    public void focusGained(FocusEvent evt) {
        if (textField.getText().equals(defaultText)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    
    @Override
    public void focusLost(FocusEvent evt) {
        if (textField.getText().isEmpty()) {
            textField.setForeground(defaultColor);
            textField.setText(defaultText);
        }
    }
}
