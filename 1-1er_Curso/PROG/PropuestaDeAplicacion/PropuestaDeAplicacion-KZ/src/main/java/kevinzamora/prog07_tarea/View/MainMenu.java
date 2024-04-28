/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kevinzamora.prog07_tarea.View;

/**
 *
 * @author kzdesigner
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

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
        btnNewAccount = new javax.swing.JButton();
        btnAccountList = new javax.swing.JButton();
        btnAccountData = new javax.swing.JButton();
        btnAddingMoney = new javax.swing.JButton();
        btnDiscountingMoney = new javax.swing.JButton();
        btnShowCurrentBalance = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDOS A NUESTRO BANCO");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setText("ADMINISTRA TU CUENTA CON LAS SIGUIENTES OPCIONES:");

        btnNewAccount.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnNewAccount.setText("Abrir una nueva cuenta");
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });

        btnAccountList.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAccountList.setText("Ver listado de cuentas disponibles");
        btnAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountListActionPerformed(evt);
            }
        });

        btnAccountData.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAccountData.setText("Ver los datos de una cuenta concreta");
        btnAccountData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountDataActionPerformed(evt);
            }
        });

        btnAddingMoney.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAddingMoney.setText("Realizar un ingreso");
        btnAddingMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddingMoneyActionPerformed(evt);
            }
        });

        btnDiscountingMoney.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnDiscountingMoney.setText("Retirar efectivo");
        btnDiscountingMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscountingMoneyActionPerformed(evt);
            }
        });

        btnShowCurrentBalance.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnShowCurrentBalance.setText("Consultar el saldo actual de mi cuenta");
        btnShowCurrentBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCurrentBalanceActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccountData, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddingMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiscountingMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnNewAccount)
                .addGap(18, 18, 18)
                .addComponent(btnAccountList)
                .addGap(18, 18, 18)
                .addComponent(btnAccountData)
                .addGap(18, 18, 18)
                .addComponent(btnAddingMoney)
                .addGap(18, 18, 18)
                .addComponent(btnDiscountingMoney)
                .addGap(18, 18, 18)
                .addComponent(btnShowCurrentBalance)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        CreateMenu createMenu1 = new CreateMenu();
        mainMenu1.setVisible(false);
        createMenu1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private void btnAccountListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountListActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        AccountsList accountsList1 = new AccountsList();
        mainMenu1.setVisible(false);
        accountsList1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAccountListActionPerformed

    private void btnAccountDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountDataActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        AccountData accountData1 = new AccountData();
        mainMenu1.setVisible(false);
        accountData1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAccountDataActionPerformed

    private void btnAddingMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddingMoneyActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        AddingMoney addingMoney1 = new AddingMoney();
        mainMenu1.setVisible(false);
        addingMoney1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddingMoneyActionPerformed

    private void btnDiscountingMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscountingMoneyActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        DiscountingMoney discountingMoney1 = new DiscountingMoney();
        mainMenu1.setVisible(false);
        discountingMoney1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDiscountingMoneyActionPerformed

    private void btnShowCurrentBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCurrentBalanceActionPerformed
        MainMenu mainMenu1 = new MainMenu();
        ShowCurrentBalance currentBalance1 = new ShowCurrentBalance();
        mainMenu1.setVisible(false);
        currentBalance1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnShowCurrentBalanceActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountData;
    private javax.swing.JButton btnAccountList;
    private javax.swing.JButton btnAddingMoney;
    private javax.swing.JButton btnDiscountingMoney;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JButton btnShowCurrentBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}