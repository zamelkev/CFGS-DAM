/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kevinzamora.prog07_tarea.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kzdesigner
 */
public class AccountData extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public AccountData() {
        initComponents();
    }
    
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchedAccount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnSearchAccount = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDOS A NUESTRO BANCO");
        jLabel1.setToolTipText("");

        searchedAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchedAccountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel4.setText("INTRODUCIR CUENTA A BUSCAR:");

        btnExit.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSearchAccount.setText("Buscar");
        btnSearchAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAccountActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("MOSTRAR INFORMACIÓN DE LA CUENTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(searchedAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAccount)
                    .addComponent(jLabel2))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(searchedAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchedAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchedAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchedAccountActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        AccountsList origin1 = new AccountsList();
        MainMenu mainMenu1 = new MainMenu();
        origin1.setVisible(false);
        mainMenu1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAccountActionPerformed
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:9090/db", "root", "admin");
            stmt = con.prepareStatement("SELECT * FROM Cuentas");
            rs = stmt.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            
            while(rs.next()) {
                String additionalInfo = null;
                switch(rs.getString("tipo_cuenta")) {
                    case "1":
                        additionalInfo = "Tipo de interés anual: " + rs.getString("tipo_interes_anual");
                        break;
                    case "2":
                        additionalInfo = "Comisión de mantenimiento" + rs.getString("com_mantenimiento");
                        break;
                    case "3":
                        additionalInfo = "Tipo de interés por descubierto: " 
                                + rs.getString("tipo_interes_descubierto") 
                                + " \n Máximo descubierto permitido:" 
                                + rs.getString("max_descubierto_permitido");
                        break;
                    default:
                        System.out.println("Tipo de cuenta incorrecto o desconocido");
                        break;
                }
                if(rs.getString("num_cuenta").equalsIgnoreCase(searchedAccount.getText())) {
                    JOptionPane.showMessageDialog(this, "Información de la cuenta: \n " 
                        + "Titular: " + rs.getString("nombre_y_apellidos") + " - " 
                        + rs.getString("dni") + "\n "
                        + "Número de Cuenta: " + rs.getString("num_cuenta") + "\n "
                        + "Tipo de Cuenta: " + rs.getString("tipo_cuenta") + "\n "
                        + "Saldo: " + rs.getString("saldo") + "\n " + additionalInfo                        
                    );
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado la cuenta introducida");
                }
            }
                        
            rs.close();
            stmt.close();
            con.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Conexión fallida, generando error: \n" + ex);
        }
        
    }//GEN-LAST:event_btnSearchAccountActionPerformed

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
            java.util.logging.Logger.getLogger(AccountData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearchAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField searchedAccount;
    // End of variables declaration//GEN-END:variables
}