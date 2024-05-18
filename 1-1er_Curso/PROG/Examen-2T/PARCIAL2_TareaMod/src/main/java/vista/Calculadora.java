/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author kzdesigner
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    
    double numIntroducido1 = 0;
    double numIntroducido2 = 0;
    double resultado;
    double memoria = 0;
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        outputResultado.setEditable(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void EnterNumbers(String q) {
        String nums = inputNum.getText() + q;
        inputNum.setText(nums);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNum = new javax.swing.JTextField();
        numLabel = new javax.swing.JLabel();
        resLabel = new javax.swing.JLabel();
        outputResultado = new javax.swing.JTextField();
        btnSum = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMemoria = new javax.swing.JButton();
        btnC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputNum.setText("0");
        inputNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumActionPerformed(evt);
            }
        });

        numLabel.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        numLabel.setText("Número");

        resLabel.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        resLabel.setText("Resultado");

        outputResultado.setText("0");
        outputResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputResultadoActionPerformed(evt);
            }
        });

        btnSum.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnSum.setText("Suma");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnRes.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnRes.setText("Resta");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnDiv.setText("Divide");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnMult.setText("Multiplica");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnMS.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMemoria.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnMemoria.setText("Memoria");
        btnMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMemoria))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(outputResultado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numLabel)
                                        .addGap(31, 31, 31)
                                        .addComponent(inputNum, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                                .addComponent(btnC))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLabel)
                    .addComponent(btnC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resLabel)
                    .addComponent(outputResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMS))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnMemoria)))
                .addGap(18, 18, 18)
                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnHistorial))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        if (numIntroducido1 == 0) {
            numIntroducido1 = Double.parseDouble(inputNum.getText());
            outputResultado.setText(String.valueOf(numIntroducido1));
        } else {
            numIntroducido2 = Double.parseDouble(inputNum.getText());
            resultado = numIntroducido1 + numIntroducido2;
            outputResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        if (numIntroducido1 == 0) {
            numIntroducido1 = Double.parseDouble(inputNum.getText());
            outputResultado.setText(String.valueOf(numIntroducido1));
        } else {
            numIntroducido2 = Double.parseDouble(inputNum.getText());
            resultado = numIntroducido1 - numIntroducido2;
            outputResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnResActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        if (numIntroducido1 == 0) {
            numIntroducido1 = Double.parseDouble(inputNum.getText());
            outputResultado.setText(String.valueOf(numIntroducido1));
        } else {
            numIntroducido2 = Double.parseDouble(inputNum.getText());
            resultado = numIntroducido1 * numIntroducido2;
            outputResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        if (numIntroducido1 == 0) {
            numIntroducido1 = Double.parseDouble(inputNum.getText());
            outputResultado.setText(String.valueOf(numIntroducido1));
        } else {
            numIntroducido2 = Double.parseDouble(inputNum.getText());
            resultado = numIntroducido1 / numIntroducido2;
            outputResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        inputNum.setText("");
        outputResultado.setText("");
        
        String Fn, Sn;
        
        Fn = String.valueOf(numIntroducido1);
        Sn = String.valueOf(numIntroducido2);
        
        Fn = "";
        Sn = "";
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoriaActionPerformed
        if (memoria == 0) {
            memoria = Double.parseDouble(inputNum.getText());
        } else {
            showMessageDialog(null, "El número guardado en memoria es: " + memoria 
                    + " y este ha sido cargado en el campo de entrada de texto para poder "
                            + "ser usado.");
            inputNum.setText(String.valueOf(memoria));
            
        }
    }//GEN-LAST:event_btnMemoriaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String backSp = null;
        
        if (inputNum.getText().length() > 0) {
            StringBuilder sb = new StringBuilder(inputNum.getText());
            sb.deleteCharAt(inputNum.getText().length() - 1);
            backSp = sb.toString();
            inputNum.setText(backSp);
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void outputResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputResultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        Calculadora calculadora = new Calculadora();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMemoria;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnSum;
    private javax.swing.JTextField inputNum;
    private javax.swing.JLabel numLabel;
    private javax.swing.JTextField outputResultado;
    private javax.swing.JLabel resLabel;
    // End of variables declaration//GEN-END:variables
}
