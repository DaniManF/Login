package com.mycompany.practica3m7;

import javax.swing.JOptionPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author danim
 */
public class cardLayout extends javax.swing.JFrame {

    private String ultimPanel;
    
    /**
     * Creates new form cardLayout
     */
    public cardLayout() {
        setUndecorated(true);
        
        initComponents();
        
        
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        
        cardLayout.show(getContentPane(), "card4");
        ultimPanel = "card4";

        //Asignem el ExitButton als butons de sortida
        JLabelExitSucces.addMouseListener(new ExitButton(jPanelExitSuccess));
        JLabelRegistre.addMouseListener(new ExitButton(jPanelExitRegistre));
        JLabelPrincipal.addMouseListener(new ExitButton(jPanelExitPrincipal));

        //Asignem el userText als textField dels usuaris
        jTextUser1.addFocusListener(new UserText(jTextUser1, "Introdueix l'usuari", new Color(204, 204, 204)));
        jTextUser.addFocusListener(new UserText(jTextUser, "Introdueix l'usuari", new Color(204, 204, 204)));

        //Asignem el PasswordUtils als textfields de contrasenya
        jPasswordLogin.addFocusListener(new PasswordUtils(jPasswordLogin, "Introdueix la contrasenya", new Color(204, 204, 204)));
        jPasswordRegistre1.addFocusListener(new PasswordUtils(jPasswordRegistre1, "Introdueix la contrasenya", new Color(204, 204, 204)));

        //Asignem el mateix comportament a RePassword
        jTextRepPass.addFocusListener(new PasswordUtils(jTextRepPass, "Reescriu la contrasenya", new Color(204, 204, 204)));

        //Cambiem el Focus, perque al carregar l'aplicació no em surti el usuari seleccionat al Login. Y podem veure el missatge de 'introduir l'usuari'
        jButtonSendLogin.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        successPanel = new javax.swing.JPanel();
        jLabelSuccess = new javax.swing.JLabel();
        jButtonTornar = new javax.swing.JButton();
        jPanelExitSuccess = new javax.swing.JPanel();
        JLabelExitSucces = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jPasswordRegistre1 = new javax.swing.JPasswordField();
        jLabelRepPass = new javax.swing.JLabel();
        jTextRepPass = new javax.swing.JPasswordField();
        jButtonSendRegistre = new javax.swing.JButton();
        jPanelExitRegistre = new javax.swing.JPanel();
        JLabelRegistre = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        FinestraPrincipal = new javax.swing.JPanel();
        jLabelTitleLogin = new javax.swing.JLabel();
        JLabelNouRegistre = new javax.swing.JLabel();
        jPasswordLogin = new javax.swing.JPasswordField();
        jPanelExitPrincipal = new javax.swing.JPanel();
        JLabelPrincipal = new javax.swing.JLabel();
        jButtonSendLogin = new javax.swing.JButton();
        jTextUser1 = new javax.swing.JTextField();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        successPanel.setBackground(new java.awt.Color(59, 86, 59));
        successPanel.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabelSuccess.setFont(new java.awt.Font("Supercell-Magic", 1, 36)); // NOI18N
        jLabelSuccess.setForeground(new java.awt.Color(255, 153, 0));
        jLabelSuccess.setText("Enhorabona has entrat a la aplicació!");

        jButtonTornar.setBackground(new java.awt.Color(255, 250, 232));
        jButtonTornar.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jButtonTornar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonTornar.setText("Tornar");
        jButtonTornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTornarActionPerformed(evt);
            }
        });

        jPanelExitSuccess.setBackground(new java.awt.Color(255, 0, 0));

        JLabelExitSucces.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelExitSucces.setForeground(new java.awt.Color(255, 255, 255));
        JLabelExitSucces.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelExitSucces.setText("X");

        javax.swing.GroupLayout jPanelExitSuccessLayout = new javax.swing.GroupLayout(jPanelExitSuccess);
        jPanelExitSuccess.setLayout(jPanelExitSuccessLayout);
        jPanelExitSuccessLayout.setHorizontalGroup(
            jPanelExitSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelExitSucces, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelExitSuccessLayout.setVerticalGroup(
            jPanelExitSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelExitSucces, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout successPanelLayout = new javax.swing.GroupLayout(successPanel);
        successPanel.setLayout(successPanelLayout);
        successPanelLayout.setHorizontalGroup(
            successPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successPanelLayout.createSequentialGroup()
                .addGroup(successPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExitSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(successPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelSuccess))
                    .addGroup(successPanelLayout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jButtonTornar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        successPanelLayout.setVerticalGroup(
            successPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successPanelLayout.createSequentialGroup()
                .addComponent(jPanelExitSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabelSuccess)
                .addGap(18, 18, 18)
                .addComponent(jButtonTornar)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        getContentPane().add(successPanel, "successPanel");

        LoginPanel.setBackground(new java.awt.Color(59, 86, 59));
        LoginPanel.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabelUser.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 153, 0));
        jLabelUser.setText("Introdueix usuari:");

        jLabelPass.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(255, 153, 0));
        jLabelPass.setText("Introdueix contrasenya:");

        jLabelTitle.setFont(new java.awt.Font("Supercell-Magic", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 153, 0));
        jLabelTitle.setText("Registre d'usuari");

        jPasswordRegistre1.setEditable(true);
        jPasswordRegistre1.setBackground(new java.awt.Color(255, 250, 232));
        jPasswordRegistre1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPasswordRegistre1.setForeground(new java.awt.Color(255, 153, 0));
        jPasswordRegistre1.setText("Contrasenya");

        jLabelRepPass.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jLabelRepPass.setForeground(new java.awt.Color(255, 153, 0));
        jLabelRepPass.setText("Torna introduir contrasenya:");

        jTextRepPass.setBackground(new java.awt.Color(255, 250, 232));
        jTextRepPass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTextRepPass.setForeground(new java.awt.Color(255, 153, 0));
        jTextRepPass.setText("Contrasenya");
        jTextRepPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButtonSendRegistre.setBackground(new java.awt.Color(255, 250, 232));
        jButtonSendRegistre.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jButtonSendRegistre.setForeground(new java.awt.Color(255, 153, 0));
        jButtonSendRegistre.setText("Enviar");
        jButtonSendRegistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendRegistreActionPerformed(evt);
            }
        });

        jPanelExitRegistre.setBackground(new java.awt.Color(255, 0, 0));

        JLabelRegistre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelRegistre.setForeground(new java.awt.Color(255, 255, 255));
        JLabelRegistre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelRegistre.setText("X");

        javax.swing.GroupLayout jPanelExitRegistreLayout = new javax.swing.GroupLayout(jPanelExitRegistre);
        jPanelExitRegistre.setLayout(jPanelExitRegistreLayout);
        jPanelExitRegistreLayout.setHorizontalGroup(
            jPanelExitRegistreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitRegistreLayout.createSequentialGroup()
                .addComponent(JLabelRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelExitRegistreLayout.setVerticalGroup(
            jPanelExitRegistreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitRegistreLayout.createSequentialGroup()
                .addComponent(JLabelRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextUser.setBackground(new java.awt.Color(255, 250, 232));
        jTextUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTextUser.setForeground(new java.awt.Color(255, 153, 0));
        jTextUser.setText("Introdueix l'usuari");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExitRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordRegistre1)
                                        .addComponent(jLabelRepPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextRepPass, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addComponent(jButtonSendRegistre)
                                .addGap(208, 208, 208))
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addComponent(jPanelExitRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitle)
                .addGap(32, 32, 32)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabelPass)
                .addGap(18, 18, 18)
                .addComponent(jPasswordRegistre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelRepPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextRepPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonSendRegistre)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel, "card2");

        FinestraPrincipal.setBackground(new java.awt.Color(59, 86, 59));
        FinestraPrincipal.setMaximumSize(new java.awt.Dimension(1200, 1200));
        FinestraPrincipal.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabelTitleLogin.setFont(new java.awt.Font("Supercell-Magic", 1, 36)); // NOI18N
        jLabelTitleLogin.setForeground(new java.awt.Color(255, 153, 0));
        jLabelTitleLogin.setText("Login");

        JLabelNouRegistre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JLabelNouRegistre.setForeground(new java.awt.Color(255, 153, 0));
        JLabelNouRegistre.setText("No estás registrat?");
        JLabelNouRegistre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelNouRegistreMouseClicked(evt);
            }
        });

        jPasswordLogin.setBackground(new java.awt.Color(255, 250, 232));
        jPasswordLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordLogin.setForeground(new java.awt.Color(255, 153, 0));
        jPasswordLogin.setText("Contrasenya");

        jPanelExitPrincipal.setBackground(new java.awt.Color(255, 0, 0));

        JLabelPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelPrincipal.setText("X");

        javax.swing.GroupLayout jPanelExitPrincipalLayout = new javax.swing.GroupLayout(jPanelExitPrincipal);
        jPanelExitPrincipal.setLayout(jPanelExitPrincipalLayout);
        jPanelExitPrincipalLayout.setHorizontalGroup(
            jPanelExitPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelExitPrincipalLayout.setVerticalGroup(
            jPanelExitPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitPrincipalLayout.createSequentialGroup()
                .addComponent(JLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonSendLogin.setBackground(new java.awt.Color(255, 250, 232));
        jButtonSendLogin.setFont(new java.awt.Font("Supercell-Magic", 1, 18)); // NOI18N
        jButtonSendLogin.setForeground(new java.awt.Color(255, 153, 51));
        jButtonSendLogin.setText("Entrar");
        jButtonSendLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendLoginActionPerformed(evt);
            }
        });

        jTextUser1.setBackground(new java.awt.Color(255, 250, 232));
        jTextUser1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTextUser1.setForeground(new java.awt.Color(255, 153, 0));
        jTextUser1.setText("Introdueix l'usuari");

        javax.swing.GroupLayout FinestraPrincipalLayout = new javax.swing.GroupLayout(FinestraPrincipal);
        FinestraPrincipal.setLayout(FinestraPrincipalLayout);
        FinestraPrincipalLayout.setHorizontalGroup(
            FinestraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinestraPrincipalLayout.createSequentialGroup()
                .addGroup(FinestraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExitPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FinestraPrincipalLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(FinestraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextUser1)
                            .addGroup(FinestraPrincipalLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(FinestraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSendLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLabelNouRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FinestraPrincipalLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelTitleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        FinestraPrincipalLayout.setVerticalGroup(
            FinestraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinestraPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelExitPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabelTitleLogin)
                .addGap(29, 29, 29)
                .addComponent(jTextUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSendLogin)
                .addGap(18, 18, 18)
                .addComponent(JLabelNouRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(FinestraPrincipal, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonSendRegistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendRegistreActionPerformed
        String usuariRegistre = jTextUser.getText().trim();  // Asegurem que no tingui espacis al nom
        String passRegistre = new String(jPasswordRegistre1.getPassword());
        String repPass = new String(jTextRepPass.getPassword());
        // Verificamos si el usuario o la contraseña están vacíos
        if (usuariRegistre.isEmpty() || usuariRegistre.equals("Introdueix l'usuari")
                || passRegistre.isEmpty() || passRegistre.equals("Introdueix la contrasenya")
                || repPass.isEmpty() || repPass.equals("Introdueix la contrasenya")) {
            JOptionPane.showMessageDialog(this, "Els camps d'usuari i contrasenya no poden estar buits.");
            return;  // Salir de la función si algún campo está vacío
        }
        if (PasswordUtils.verifyPassword(passRegistre, repPass)) {
            try (Connection conn = Practica3M7.getConnection()) {
                // Verificar si el usuari existeix
                String queryCheck = "SELECT * FROM usuaris WHERE nomusuari = ?";
                PreparedStatement stmtCheck = conn.prepareStatement(queryCheck);
                stmtCheck.setString(1, usuariRegistre);
                ResultSet rs = stmtCheck.executeQuery();
                if (rs.next()) {
                    // El usuario ja existeix
                    JOptionPane.showMessageDialog(this, "L'usuari ja existeix. Tria un altre nom.");
                } else {
                    // Insertar el nou usuari en la base de dades
                    String queryInsert = "INSERT INTO usuaris (nomusuari, contrasenya) VALUES (?, ?)";
                    PreparedStatement stmtInsert = conn.prepareStatement(queryInsert);
                    stmtInsert.setString(1, usuariRegistre);
                    stmtInsert.setString(2, passRegistre);

                    int rowsInserted = stmtInsert.executeUpdate();
                    if (rowsInserted > 0) {
                        // Registre exitos, cambiar al successPanel
                        ultimPanel = "card2";
                        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                        cardLayout.show(getContentPane(), "successPanel");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al registrar L'usuari.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al conectar amb la base de dades: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Les contrasenyas no coincideixen.");
        }
    }//GEN-LAST:event_jButtonSendRegistreActionPerformed


    private void jButtonTornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTornarActionPerformed
        //Restablir els camps de text
        jTextUser1.setText("Introdueix l'usuari");
        jTextUser1.setForeground(new Color(204, 204, 204));

        jTextUser.setText("Introdueix l'usuari");
        jTextUser.setForeground(new Color(204, 204, 204));

        jPasswordLogin.setText("Introdueix la contrasenya");
        jPasswordLogin.setForeground(new Color(204, 204, 204));

        jPasswordRegistre1.setText("Introdueix la contrasenya");
        jPasswordRegistre1.setForeground(new Color(204, 204, 204));
        
        jTextRepPass.setText("Introdueix la contrasenya");
        jTextRepPass.setForeground(new Color(204, 204, 204));

        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        
            cardLayout.show(getContentPane(), "card4");
    }//GEN-LAST:event_jButtonTornarActionPerformed
    


    private void JLabelNouRegistreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelNouRegistreMouseClicked
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "card2");
        ultimPanel = "card4";
    }//GEN-LAST:event_JLabelNouRegistreMouseClicked


    private void jButtonSendLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendLoginActionPerformed
        String usuariLogin = jTextUser1.getText().trim();
        String passLogin = new String(jPasswordLogin.getPassword());

        if (usuariLogin.isEmpty() || usuariLogin.equals("Introdueix l'usuari")
                || passLogin.isEmpty() || passLogin.equals("Introdueix la contrasenya")) {
            JOptionPane.showMessageDialog(this, "Els camps d'usuari i contrasenya no poden estar buits.");
            return;  // Salir de la función si algún campo está vacío
        }
        try (Connection conn = Practica3M7.getConnection()) {
            // Verificar si el usuari existeix
            String queryCheck = "SELECT * FROM usuaris WHERE nomusuari = ?";
            PreparedStatement stmtCheck = conn.prepareStatement(queryCheck);
            stmtCheck.setString(1, usuariLogin);
            ResultSet rs = stmtCheck.executeQuery();
            if (rs.next()) {
                // El usuario ja existeix
                JOptionPane.showMessageDialog(this, "L'usuari ja existeix. Tria un altre nom.");
            } else {
                // Insertar el nou usuari en la base de dades
                String queryInsert = "INSERT INTO usuaris (nomusuari, contrasenya) VALUES (?, ?)";
                PreparedStatement stmtInsert = conn.prepareStatement(queryInsert);
                stmtInsert.setString(1, usuariLogin);
                stmtInsert.setString(2, passLogin);

                int rowsInserted = stmtInsert.executeUpdate();
                if (rowsInserted > 0) {
                    // Registre exitos, cambiar al successPanel
                    CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                    cardLayout.show(getContentPane(), "successPanel");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar L'usuari.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de dades: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonSendLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FinestraPrincipal;
    private javax.swing.JLabel JLabelExitSucces;
    private javax.swing.JLabel JLabelNouRegistre;
    private javax.swing.JLabel JLabelPrincipal;
    private javax.swing.JLabel JLabelRegistre;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton jButtonSendLogin;
    private javax.swing.JButton jButtonSendRegistre;
    private javax.swing.JButton jButtonTornar;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelRepPass;
    private javax.swing.JLabel jLabelSuccess;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleLogin;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelExitPrincipal;
    private javax.swing.JPanel jPanelExitRegistre;
    private javax.swing.JPanel jPanelExitSuccess;
    private javax.swing.JPasswordField jPasswordLogin;
    private javax.swing.JPasswordField jPasswordRegistre1;
    private javax.swing.JPasswordField jTextRepPass;
    private javax.swing.JTextField jTextUser;
    private javax.swing.JTextField jTextUser1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JPanel successPanel;
    // End of variables declaration//GEN-END:variables
 
}