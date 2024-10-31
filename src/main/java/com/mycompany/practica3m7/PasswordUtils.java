package com.mycompany.practica3m7;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

/**
 *
 * @author danim
 */
public class PasswordUtils extends FocusAdapter{
    
    private JPasswordField passwordField;
    private String defaultText;
    private Color defaultColor;
    
    
    public PasswordUtils(JPasswordField passwordField, String defaultText, Color defaultColor) {
        this.passwordField = passwordField;
        this.defaultText = defaultText;
        this.defaultColor = defaultColor;
        this.passwordField.setForeground(defaultColor);
        this.passwordField.setText(defaultText);
    }

    
    @Override
    public void focusGained(FocusEvent evt) {
        if (new String(passwordField.getPassword()).equals(defaultText)) {
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK); 
        }
    }

    
    @Override
    public void focusLost(FocusEvent evt) {
        if (new String(passwordField.getPassword()).isEmpty()) {
            passwordField.setForeground(defaultColor);
            passwordField.setText(defaultText);
        }
    }
    
    
    // Verifica si las contraseñas coinciden
    public static boolean verifyPassword(String pass, String repPass) {
        return pass != null && pass.equals(repPass);
    }
    
    
    
}
