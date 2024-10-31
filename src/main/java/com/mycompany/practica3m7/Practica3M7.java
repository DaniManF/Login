/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3m7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danim
 */
public class Practica3M7 {
    
    // Variables para la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/Practica3";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de dades");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardLayout().setVisible(true);
            }
        });
    }
}
