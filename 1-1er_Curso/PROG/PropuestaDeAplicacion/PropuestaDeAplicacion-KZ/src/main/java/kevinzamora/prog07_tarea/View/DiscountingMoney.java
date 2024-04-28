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
import javax.swing.JOptionPane;

/**
 *
 * @author kzdesigner
 */
public class DiscountingMoney extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public DiscountingMoney() {
        initComponents();
    }
    
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Double saldo = null;
    Double balanceToDiscount = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnDiscountingCash = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchedAccount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        introducedBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDOS A NUESTRO BANCO");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setText("ADMINISTRA TU CUENTA CON LAS SIGUIENTES OPCIONES:");

        btnExit.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDiscountingCash.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnDiscountingCash.setText("Retirar");
        btnDiscountingCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscountingCashActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setText("RETIRAR EFECTIVO");

        searchedAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchedAccountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel4.setText("INTRODUCE EL IMPORTE A RETIRAR:");

        introducedBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducedBalanceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel5.setText("INTRODUCIR CUENTA A BUSCAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel3)
                        .addComponent(searchedAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(introducedBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(btnDiscountingCash))
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(258, 258, 258)
                .addComponent(btnExit)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jLabel3)
                    .addGap(11, 11, 11)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(searchedAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(introducedBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnDiscountingCash)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        AccountsList origin1 = new AccountsList();
        MainMenu mainMenu1 = new MainMenu();
        origin1.setVisible(false);
        mainMenu1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDiscountingCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscountingCashActionPerformed
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:9090/db", "root", "admin");
            stmt = con.prepareStatement("SELECT * FROM Cuentas");
            rs = stmt.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            
            while(rs.next()) {
                if(rs.getString("num_cuenta").equalsIgnoreCase(searchedAccount.getText())) {
                    saldo = rs.getDouble("saldo");
                    balanceToDiscount = Double.parseDouble(introducedBalance.getSelectedText());
                    saldo = saldo + balanceToDiscount;
                    System.out.println("Tú nuevo saldo en cuenta es: " + saldo);
                    stmt = con.prepareStatement("UPDATE Cuentas SET saldo = " + saldo + " WHERE num_cuenta = '" 
                            + searchedAccount.getText() + "'");
                    JOptionPane.showMessageDialog(this, "Tu nuevo saldo en cuenta es: " + rs.getDouble("saldo"));
                    dispose();
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
    }//GEN-LAST:event_btnDiscountingCashActionPerformed

    private void searchedAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchedAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchedAccountActionPerformed

    private void introducedBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducedBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introducedBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(DiscountingMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiscountingMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiscountingMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiscountingMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscountingMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscountingCash;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField introducedBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField searchedAccount;
    // End of variables declaration//GEN-END:variables
}
