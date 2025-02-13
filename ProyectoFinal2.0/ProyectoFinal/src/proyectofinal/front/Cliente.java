/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.front;

import java.awt.Window;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class Cliente extends javax.swing.JFrame {

 
    private String nombre;
    private int idUsuario;
    private int telefono;
   
public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsers = new javax.swing.JPanel();
        jLabelTitleUsers = new javax.swing.JLabel();
        jLabelNameUsers = new javax.swing.JLabel();
        jLabelId_User = new javax.swing.JLabel();
        jButtonRegisterUsers = new javax.swing.JButton();
        jTextNameUsers = new javax.swing.JTextField();
        jTextId_Users = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jButtonCerrarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUsers.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTitleUsers.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabelTitleUsers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitleUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleUsers.setText("SECCIÓN USUARIOS");

        jLabelNameUsers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNameUsers.setText("Nombre:");

        jLabelId_User.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelId_User.setText("Cédula:");

        jButtonRegisterUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRegisterUsers.setText("Registrar");
        jButtonRegisterUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterUsersActionPerformed(evt);
            }
        });

        jTextNameUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameUsersActionPerformed(evt);
            }
        });

        jTextId_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextId_UsersActionPerformed(evt);
            }
        });

        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelefono.setText("Telefono:");

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        jButtonCerrarTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCerrarTodo.setText("Cerrar");
        jButtonCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsersLayout = new javax.swing.GroupLayout(jPanelUsers);
        jPanelUsers.setLayout(jPanelUsersLayout);
        jPanelUsersLayout.setHorizontalGroup(
            jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsersLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabelTitleUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelUsersLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCerrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelUsersLayout.createSequentialGroup()
                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextTelefono))
                        .addGroup(jPanelUsersLayout.createSequentialGroup()
                            .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelId_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNameUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNameUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextId_Users)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jButtonRegisterUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelUsersLayout.setVerticalGroup(
            jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsersLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelTitleUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameUsers)
                    .addComponent(jTextNameUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsersLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelId_User)
                            .addComponent(jTextId_Users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelUsersLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonRegisterUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButtonCerrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterUsersActionPerformed
       
   try {
        // Validar que todos los campos estén llenos
        if (jTextNameUsers.getText().trim().isEmpty() || 
            jTextId_Users.getText().trim().isEmpty() || 
            jTextTelefono.getText().trim().isEmpty()){
            //jComboBox1.getSelectedIndex() == 0) {  // Verifica que haya una opción seleccionada válida
            
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "ERROR DE DATOS", JOptionPane.ERROR_MESSAGE);
            return;
        }

       
        String nombre = jTextNameUsers.getText().trim();

        int idUsuario;
        int telefono;
        
        try {
            idUsuario = Integer.parseInt(jTextId_Users.getText().trim());
            telefono = Integer.parseInt(jTextTelefono.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID y Teléfono deben ser números enteros.", "ERROR DE FORMATO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente. Continúe con el préstamo.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Bienvenido a la librería, " + nombre);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
   Prestamo prestar = new Prestamo(Cliente.this);

        prestar.setVisible(true);
        this.dispose();
     // Abrir la ventana de préstamo
        /*if(jComboBox1.getSelectedItem().toString().equals("Prestamo")){
        Prestamo prestar = new Prestamo(Cliente.this);

        prestar.setVisible(true);
        this.dispose();
        }
     else if (jComboBox1.getSelectedItem().toString().equals("Devolucion")) {
        // Devolucion devolver = new Devolucion();
         //devolver.setVisible(true);
         
     }*/
    }//GEN-LAST:event_jButtonRegisterUsersActionPerformed

    private void jTextNameUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameUsersActionPerformed

    private void jTextId_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextId_UsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextId_UsersActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jButtonCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarTodoActionPerformed
               for (Window window : Window.getWindows()) {
            window.dispose(); // Cierra todas las ventanas abiertas
        }
    }//GEN-LAST:event_jButtonCerrarTodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarTodo;
    private javax.swing.JButton jButtonRegisterUsers;
    private javax.swing.JLabel jLabelId_User;
    private javax.swing.JLabel jLabelNameUsers;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitleUsers;
    private javax.swing.JPanel jPanelUsers;
    private javax.swing.JTextField jTextId_Users;
    private javax.swing.JTextField jTextNameUsers;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables

    public String getIdCliente() {
        return jTextId_Users.getText();
    }
    public String getNombre() {
        return jTextNameUsers.getText();
    } 
    public String getTelefono() {
        return jTextTelefono.getText();
    }

    
}
