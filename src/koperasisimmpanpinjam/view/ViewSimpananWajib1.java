/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author Hariadi Adha F
 */
public class ViewSimpananWajib1 extends javax.swing.JFrame {

    /**
     * Creates new form SimpananWajib1
     */
    public ViewSimpananWajib1() {
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
        txtJmlWajib = new javax.swing.JLabel();
        inputDibayar = new javax.swing.JTextField();
        txtDibayar = new javax.swing.JLabel();
        inputJumlahWajib1 = new javax.swing.JTextField();
        txtTanggal1 = new javax.swing.JLabel();
        inputTanggal1 = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JLabel();
        inputKeterangan = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        checkBoxSimpananWajib = new javax.swing.JCheckBox();
        txtSimpananWajib = new javax.swing.JLabel();
        btnBackInSimpWajib = new javax.swing.JButton();

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

        txtJmlWajib.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtJmlWajib.setText("Jumlah Wajib");

        inputDibayar.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputDibayar.setText("Rp.-");

        txtDibayar.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtDibayar.setText("Dibayar");

        inputJumlahWajib1.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputJumlahWajib1.setText("Rp.1.000.000,00");

        txtTanggal1.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtTanggal1.setText("Tanggal");

        inputTanggal1.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputTanggal1.setText("DD/MM/YYYY");

        txtKeterangan.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        txtKeterangan.setText("Keterangan");

        inputKeterangan.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        inputKeterangan.setText("Keterangan");

        btnBayar.setBackground(new java.awt.Color(102, 0, 51));
        btnBayar.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        checkBoxSimpananWajib.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        checkBoxSimpananWajib.setText("Dengan ini saya menyatakan setuju dengan jumlah yang akan saya simpan");
        checkBoxSimpananWajib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSimpananWajibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBoxSimpananWajib))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJmlWajib)
                            .addComponent(txtKeterangan)
                            .addComponent(txtTanggal1)
                            .addComponent(txtDibayar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputJumlahWajib1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJmlWajib)
                    .addComponent(inputJumlahWajib1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTanggal1)
                    .addComponent(inputTanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDibayar))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeterangan))
                .addGap(33, 33, 33)
                .addComponent(checkBoxSimpananWajib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        txtSimpananWajib.setFont(new java.awt.Font("Roboto", 1, 64)); // NOI18N
        txtSimpananWajib.setForeground(new java.awt.Color(255, 255, 255));
        txtSimpananWajib.setText("Simpanan Wajib");

        btnBackInSimpWajib.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        btnBackInSimpWajib.setForeground(new java.awt.Color(204, 0, 51));
        btnBackInSimpWajib.setText("Kembali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBackInSimpWajib, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSimpananWajib))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSimpananWajib)
                    .addComponent(btnBackInSimpWajib, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
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

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBayarActionPerformed

    private void checkBoxSimpananWajibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSimpananWajibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxSimpananWajibActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackInSimpWajib;
    private javax.swing.JButton btnBayar;
    private javax.swing.JCheckBox checkBoxSimpananWajib;
    private javax.swing.JTextField inputDibayar;
    private javax.swing.JTextField inputJumlahWajib1;
    private javax.swing.JTextField inputKeterangan;
    private javax.swing.JTextField inputTanggal1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtDibayar;
    private javax.swing.JLabel txtJmlWajib;
    private javax.swing.JLabel txtKeterangan;
    private javax.swing.JLabel txtSimpananWajib;
    private javax.swing.JLabel txtTanggal1;
    // End of variables declaration//GEN-END:variables
    
//    public void addBayarListener(ActionListener x){
//        btnBayar.addActionListener(x);
//    }

    public String getInputDibayar() {
        return inputDibayar.getText();
    }

    public void setInputDibayar(String inputDibayar) {
        this.inputDibayar.setText(inputDibayar);
    }

    public String getInputJumlahWajib1() {
        return inputJumlahWajib1.getText();
    }

    public void setInputJumlahWajib1(String inputJumlahWajib1) {
        this.inputJumlahWajib1.setText(inputJumlahWajib1);
    }

    public String getInputKeterangan() {
        return inputKeterangan.getText();
    }

    public void setInputKeterangan(String inputKeterangan) {
        this.inputKeterangan.setText(inputKeterangan);
    }

    public String getInputTanggal1() {
        return inputTanggal1.getText();
    }

    public void setInputTanggal1(String inputTanggal1) {
        this.inputTanggal1.setText(inputTanggal1);
    }

    public JButton getBtnBackInSimpWajib() {
        return btnBackInSimpWajib;
    }

    public void setBtnBackInSimpWajib(JButton btnBackInSimpWajib) {
        this.btnBackInSimpWajib = btnBackInSimpWajib;
    }

    public JCheckBox getCheckBoxSimpananWajib() {
        return checkBoxSimpananWajib;
    }

    public void setCheckBoxSimpananWajib(JCheckBox checkBoxSimpananWajib) {
        this.checkBoxSimpananWajib = checkBoxSimpananWajib;
    }

    public JButton getBtnBayar() {
        return btnBayar;
    }

    public void setBtnBayar(JButton btnBayar) {
        this.btnBayar = btnBayar;
    }
    
    
    
    public void addActionListener(ActionListener e){
        btnBackInSimpWajib.addActionListener(e);
        btnBayar.addActionListener(e);
    }
}
