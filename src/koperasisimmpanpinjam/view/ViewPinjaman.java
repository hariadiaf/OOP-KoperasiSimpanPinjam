/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam.view;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author Hariadi Adha F
 */
public class ViewPinjaman extends javax.swing.JFrame {

    /**
     * Creates new form Pinjaman
     */
    public ViewPinjaman() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBesarPinjaman = new javax.swing.JLabel();
        inputBesarPinjaman = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JLabel();
        inputTglPinjam = new javax.swing.JTextField();
        txNamaPinjaman = new javax.swing.JLabel();
        inputNamaPinjPinjaman = new javax.swing.JTextField();
        btnPinjam = new javax.swing.JButton();
        txtTglBayar = new javax.swing.JLabel();
        inputTglBayar = new javax.swing.JTextField();
        checkBoxPinjaman = new javax.swing.JCheckBox();
        cbText1 = new javax.swing.JLabel();
        cbText2 = new javax.swing.JLabel();
        txtPinjaman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 90, 79));

        jPanel2.setBackground(new java.awt.Color(33, 57, 95));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(229, 229, 229));

        txtBesarPinjaman.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtBesarPinjaman.setText("Besar Pinjaman");

        inputBesarPinjaman.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputBesarPinjaman.setText("Rp.1.000.000,00");

        txtTglPinjam.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtTglPinjam.setText("Tanggal Pinjam");

        inputTglPinjam.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputTglPinjam.setText("DD/MM/YYYY");
        inputTglPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTglPinjamActionPerformed(evt);
            }
        });

        txNamaPinjaman.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txNamaPinjaman.setText("Nama Pinjaman");

        inputNamaPinjPinjaman.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputNamaPinjPinjaman.setText("Nama/Tujuan");

        btnPinjam.setBackground(new java.awt.Color(102, 0, 51));
        btnPinjam.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        txtTglBayar.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtTglBayar.setText("Tanggal Bayar");

        inputTglBayar.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputTglBayar.setText("DD/MM/YYYY");

        checkBoxPinjaman.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        checkBoxPinjaman.setText("Dengan ini saya menyatakan setuju dengan jumlah yang akan saya");
        checkBoxPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPinjamanActionPerformed(evt);
            }
        });

        cbText1.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        cbText1.setText("pinjam dengan besar bunga 5% dan apabila telat membayar akan ");

        cbText2.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        cbText2.setText("menambah bayar Rp.5000.000,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBesarPinjaman)
                            .addComponent(txNamaPinjaman)
                            .addComponent(txtTglPinjam)
                            .addComponent(txtTglBayar))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNamaPinjPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBesarPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTglBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkBoxPinjaman)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(cbText1))))
                        .addGap(85, 85, 85))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(cbText2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBesarPinjaman)
                    .addComponent(inputBesarPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglPinjam)
                    .addComponent(inputTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglBayar)
                    .addComponent(inputTglBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNamaPinjPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNamaPinjaman))
                .addGap(38, 38, 38)
                .addComponent(checkBoxPinjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbText2)
                .addGap(31, 31, 31)
                .addComponent(btnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtPinjaman.setFont(new java.awt.Font("Roboto", 1, 64)); // NOI18N
        txtPinjaman.setForeground(new java.awt.Color(255, 255, 255));
        txtPinjaman.setText("Pinjaman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPinjaman)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtPinjaman)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void checkBoxPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPinjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxPinjamanActionPerformed

    private void inputTglPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTglPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTglPinjamActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPinjam;
    private javax.swing.JLabel cbText1;
    private javax.swing.JLabel cbText2;
    private javax.swing.JCheckBox checkBoxPinjaman;
    private javax.swing.JTextField inputBesarPinjaman;
    private javax.swing.JTextField inputNamaPinjPinjaman;
    private javax.swing.JTextField inputTglBayar;
    private javax.swing.JTextField inputTglPinjam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txNamaPinjaman;
    private javax.swing.JLabel txtBesarPinjaman;
    private javax.swing.JLabel txtPinjaman;
    private javax.swing.JLabel txtTglBayar;
    private javax.swing.JLabel txtTglPinjam;
    // End of variables declaration//GEN-END:variables
    public void addPinjamListener(ActionListener x) {
        btnPinjam.addActionListener(x);
    }

    public String getInputBesarPinjaman() {
        return inputBesarPinjaman.getText();
    }

    public void setInputBesarPinjaman(String inputBesarPinjaman) {
        this.inputBesarPinjaman.setText(inputBesarPinjaman);
    }

    public String getInputNamaPinjPinjaman() {
        return inputNamaPinjPinjaman.getText();
    }

    public void setInputNamaPinjPinjaman(String inputNamaPinjPinjaman) {
        this.inputNamaPinjPinjaman.setText(inputNamaPinjPinjaman);
    }

    public String getInputTglBayar() {
        return inputTglBayar.getText();
    }

    public void setInputTglBayar(String inputTglBayar) {
        this.inputTglBayar.setText(inputTglBayar);
    }

    public String getInputTglPinjam() {
        return inputTglPinjam.getText();
    }

    public void setInputTglPinjam(String inputTglPinjam) {
        this.inputTglPinjam.setText(inputTglPinjam);
    }

    public boolean getCheckBoxPinjaman() {
        return checkBoxPinjaman.isSelected();
    }

    public void setCheckBoxPinjaman(JCheckBox checkBoxPinjaman) {
        this.checkBoxPinjaman = checkBoxPinjaman;
    }

}
