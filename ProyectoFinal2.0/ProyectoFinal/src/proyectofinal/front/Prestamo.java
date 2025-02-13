/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.front;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import proyectofinal.Fecha_Prestamo;
import proyectofinal.Inventario;

/**
 *
 * @author admin
 */
public class Prestamo extends Cliente implements Fecha_Prestamo  {
    
    public Prestamo ventanaAnterior; // Variable para almacenar la ventana anterior

    public void VentanaPrestamo(Prestamo ventanaAnterior) {
    this.ventanaAnterior = ventanaAnterior;

}
    public Cliente usuario;
    
    DefaultTableModel modeloTabla;
    DefaultTableModel modeloTabla1;
    private int filaselec;
    
    public Prestamo(Cliente usuario) {
    this.usuario = usuario; 
    this.setContentPane(background);  
    initComponents(); 
    
    modeloTabla1 = new DefaultTableModel(new String[]{"ID Libro", "Título", "Plazo"}, 0);
    jTable1.setModel(modeloTabla1);

    Inventario.llenarTabla();
    modeloTabla = Inventario.getModeloTabla();
    jTable.setModel(modeloTabla);
    }

    public Cliente getUsuario() {
        return usuario;
    }
    public String getFechaInicio() {
    return fecha1.getText().trim();
    }

    public String getFechaFin() {
    return fecha2.getText().trim();
    }
    
    BackgroundPanel background = new BackgroundPanel();
    class BackgroundPanel extends JPanel
    {
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
     setOpaque(false);
     
    imagen = new ImageIcon(getClass().getResource("/images/2121.jpg")).getImage();
    g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        
        super.paint(g);
    }
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JTextField();
        fecha2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ACEPTAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ID_Cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonReturnUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Libros disponibles...");

        jTable.setAutoCreateRowSorter(true);
        jTable.setBackground(new java.awt.Color(0, 0, 0));
        jTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable.setForeground(new java.awt.Color(204, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Genero", "Titulo", "Autor", "Id_Libro", "Stock"
            }
        ));
        jTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Fecha Inicio:");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Fecha Fin:");

        fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha1ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_Libro", "Titulo", "Plazo limite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        ACEPTAR.setBackground(new java.awt.Color(204, 204, 204));
        ACEPTAR.setText("Aceptar Prestamo");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Cédula Cliente :");

        ID_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_ClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Telefono:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Datos usuario...");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jButtonReturnUsuario.setText("Nuevo Usuario");
        jButtonReturnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonReturnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACEPTAR)
                    .addComponent(jButtonReturnUsuario))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
      int fila = jTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No seleccionó una fila", "Seleccionar fila", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jTableMouseClicked

    private void fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha1ActionPerformed
        
    }//GEN-LAST:event_fecha1ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        if (modeloTabla1.getRowCount() > 0) {
        JOptionPane.showMessageDialog(null, "Préstamo exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Obtener el modelo de la tabla actual
        DefaultTableModel modeloPrestamo = (DefaultTableModel) jTable1.getModel();

        // Pasar el modelo a la ventana de Devolucion
        Devolucion devolucionFrame = new Devolucion(modeloPrestamo);
        devolucionFrame.setVisible(true);
        
        // Opcional: Cerrar la ventana actual
        // this.dispose();
    }else{
        JOptionPane.showMessageDialog(null, "Préstamo No realizado, Vuelva a intentarlo", "Denegado", JOptionPane.INFORMATION_MESSAGE);  
        }
        
        //Cliente cliente = new Cliente();
        //cliente.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = jTable.getSelectedRow();
    
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "No seleccionó fila", "Seleccionar fila", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String idLibro = jTable.getValueAt(fila, 3).toString();
    String titulo = jTable.getValueAt(fila, 1).toString();

    Date fechaInicio = Fecha_Prestamo.convertirFecha(fecha1.getText());
    Date fechaFin = Fecha_Prestamo.convertirFecha(fecha2.getText());
  
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    String fechaInicio1 = fecha.format(fechaInicio);
    String fechaInicio2 = fecha.format(fechaFin);
    
    if (fechaInicio == null || fechaFin == null) {
        JOptionPane.showMessageDialog(null, "Ingrese ambas fechas", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String plazo = fechaInicio1 + " - " + fechaInicio2; 
    ID_Cliente.setText(usuario.getIdCliente());
    nombre1.setText(usuario.getNombre());
    telefono1.setText(usuario.getTelefono());

    for (int i = 0; i < modeloTabla1.getRowCount(); i++) {
    if (modeloTabla1.getValueAt(i, 0).toString().equals(idLibro)) {
        JOptionPane.showMessageDialog(null, "El libro ya ha sido agregado", "Libro Duplicado", JOptionPane.WARNING_MESSAGE);
        return;  
    }
}
 
    modeloTabla1.addRow(new Object[]{idLibro, titulo, plazo});
       
    
    int IdLibro = Integer.parseInt(idLibro);
    if(Inventario.prestarLibro(IdLibro)){
         JOptionPane.showMessageDialog(null, "Libro agregado", " ", JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null, "No hay stock Disponible", " ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    jTable.setModel(Inventario.getModeloTabla());
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ID_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_ClienteActionPerformed

    private void jButtonReturnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnUsuarioActionPerformed
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonReturnUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
        
      
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JTextField ID_Cliente;
    private javax.swing.JTextField fecha1;
    private javax.swing.JTextField fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReturnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField telefono1;
    // End of variables declaration//GEN-END:variables
}
