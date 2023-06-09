/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main.GUI;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tharun
 */
public class IndexPage extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    public IndexPage() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnsignup = new javax.swing.JButton();
        bitnsignin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel2.setText("SMILE GAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 280, 70));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        btnsignup.setBackground(new java.awt.Color(255, 153, 51));
        btnsignup.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btnsignup.setText("EXIT");
        btnsignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        btnsignup.setBorderPainted(false);
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 130, 50));

        bitnsignin.setBackground(new java.awt.Color(255, 153, 51));
        bitnsignin.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        bitnsignin.setText("START");
        bitnsignin.setBorder(null);
        bitnsignin.setBorderPainted(false);
        bitnsignin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bitnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitnsigninActionPerformed(evt);
            }
        });
        jPanel2.add(bitnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\athar\\Downloads\\smile2.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 550));

        jLabel3.setText("BY THARUN AROORAN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 539, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
   
        dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void bitnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitnsigninActionPerformed
        // TODO add your handling code here:+
    
          new GameUserInterface().setVisible(true);
          dispose();
    }//GEN-LAST:event_bitnsigninActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bitnsignin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public ActionListener setVisible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
