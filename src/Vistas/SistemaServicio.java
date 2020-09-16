/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BO.ServicioBO;
import Entidades.Servicio;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

/**
 *
 * @author marck
 */
public class SistemaServicio extends javax.swing.JFrame {

    /**
     * Creates new form AgregarServicio
     */
    private ServicioBO sbo = new ServicioBO();

    public SistemaServicio() {
        initComponents();
        listarServicio();
        idMax();
        activo();
    }

    public void listarServicio() {
        sbo.listarServicio(tbServicios);
    }

    public void idMax() {
        txtID.setText(sbo.getMaxID() + "");
    }

    public void limpiar() {
        txtServicio.setText("");
        txtDescripcion.setText("");
        txtValor.setText("");
        txtID2.setText("");
        activo();
    }

    public void activo() {
        txtID.setVisible(false);
        txtID.setEnabled(false);
        txtID2.setEnabled(false);
        txtID2.setVisible(false);
        txtServicio.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtValor.setEnabled(true);
    }

    public void desactivado() {
        txtID.setVisible(false);
        txtID.setEnabled(false);
        txtID2.setEnabled(false);
        txtID2.setVisible(false);
        txtServicio.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtValor.setEnabled(true);
    }

    public Boolean validarNombre() {
        if (txtServicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Servicio");
            return false;
        } else {
            return true;
        }
    }

    public Boolean validarValor() {
        if (txtValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Valor");
            return false;
        } else if (!txtValor.getText().matches("[0-9]{1,20}")) {
            JOptionPane.showMessageDialog(null, "Ingrese solo Digitos en Valor");
            return false;
        } else {
            return true;
        }
    }

    public Boolean validarDescripcion() {
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Descripción");
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtServicio = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbServicios = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        txtID = new javax.swing.JTextField();
        txtID2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDescripcion = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtServicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtServicio.setBorder(null);
        jPanel1.add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, -1));

        txtValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtValor.setBorder(null);
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, -1));

        tbServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbServiciosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbServicios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 592, 318));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar.jpg"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar 2.jpg"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar 2.jpg"))); // NOI18N
        btnRegistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar 2.jpg"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.jpg"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar 2.jpg"))); // NOI18N
        btnModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar 2.jpg"))); // NOI18N
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar 2.jpg"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 31));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.jpg"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar 2.jpg"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar 2.jpg"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar 2.jpg"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 130, 31));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.jpg"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar 2.jpg"))); // NOI18N
        btnLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar 2.jpg"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar 2.jpg"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 130, 31));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 33, -1));
        jPanel1.add(txtID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 33, -1));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Sistema Servicio");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 300, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Linda Sonrisa.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 100));

        jLabel22.setBackground(new java.awt.Color(102, 153, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 153, 255));
        jLabel22.setText("Descripción");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 10));

        txtDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDescripcion.setBorder(null);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        jLabel23.setBackground(new java.awt.Color(102, 153, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 153, 255));
        jLabel23.setText("Linda Sonrisa");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        jLabel24.setBackground(new java.awt.Color(102, 153, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 153, 255));
        jLabel24.setText("Nombre Servicio");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        jLabel25.setBackground(new java.awt.Color(102, 153, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 153, 255));
        jLabel25.setText("Valor");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 160, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuAdministrador srb = new MenuAdministrador();
        srb.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        idMax();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Object[] options = {"Si", "No"};
        int var = JOptionPane.showOptionDialog(this, "Si Elimina el Servicio se eliminaran Reservas asociados a el.\n ¿Desea Continuar?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (var == 0) {
            if (txtID2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione el Servicio que desea Eliminar");
            } else {
                String mensaje2 = sbo.eliminarReserva(Integer.parseInt(txtID.getText()));
                String mensaje = sbo.eliminarServicio(Integer.parseInt(txtID.getText()));
                JOptionPane.showMessageDialog(null, mensaje);
                JOptionPane.showMessageDialog(null, mensaje2);
                listarServicio();
                limpiar();
                idMax();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtID2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione Item a Modificar");
        } else if (validarValor() == false) {
        } else {

            Servicio ser = new Servicio();

            ser.setId_servicio(Integer.parseInt(txtID.getText()));
            ser.setValor_servicio(Integer.parseInt(txtValor.getText().toUpperCase()));
            String mensaje = sbo.modificarServicio(ser);
            JOptionPane.showMessageDialog(null, mensaje);

            listarServicio();
            limpiar();
            idMax();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarNombre() == false || validarValor() == false || validarDescripcion() == false) {
        } else {

            Servicio ser = new Servicio();

            ser.setId_servicio(Integer.parseInt(txtID.getText()));
            ser.setNom_servicio(txtServicio.getText().toUpperCase());
            ser.setDescripcion_servicio(txtDescripcion.getText().toUpperCase());
            ser.setValor_servicio(Integer.parseInt(txtValor.getText().toUpperCase()));
            String mensaje = sbo.agregarServicio(ser);
            JOptionPane.showMessageDialog(null, mensaje);

            listarServicio();
            limpiar();
            idMax();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tbServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbServiciosMouseClicked
        int seleccion = tbServicios.rowAtPoint(evt.getPoint());
        txtID2.setText(tbServicios.getValueAt(seleccion, 0) + "");
        txtID.setText(tbServicios.getValueAt(seleccion, 0) + "");
        txtServicio.setText(tbServicios.getValueAt(seleccion, 1) + "");
        txtDescripcion.setText(tbServicios.getValueAt(seleccion, 2) + "");
        txtValor.setText(tbServicios.getValueAt(seleccion, 3) + "");
        desactivado();
    }//GEN-LAST:event_tbServiciosMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tbServicios;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
