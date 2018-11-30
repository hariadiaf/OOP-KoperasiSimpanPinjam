package koperasisimmpanpinjam.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToggleButton;


public class ViewMenuAnggota extends javax.swing.JFrame {

    public ViewMenuAnggota() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtMenuAnggota = new javax.swing.JLabel();
        btnSimpanan = new javax.swing.JButton();
        btnPinjaman = new javax.swing.JButton();
        btnAngsuran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 1042));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 90, 79));

        jPanel2.setBackground(new java.awt.Color(44, 73, 117));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1561, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        txtMenuAnggota.setBackground(new java.awt.Color(255, 255, 255));
        txtMenuAnggota.setFont(new java.awt.Font("Roboto", 1, 64)); // NOI18N
        txtMenuAnggota.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuAnggota.setText("Menu Anggota");

        btnSimpanan.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnSimpanan.setText("Simpanan");

        btnPinjaman.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnPinjaman.setText("Pinjaman");

        btnAngsuran.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnAngsuran.setText("Angsuran");
        btnAngsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngsuranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenuAnggota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(txtMenuAnggota)
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSimpanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPinjaman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAngsuran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(464, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1561, 1234);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAngsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngsuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAngsuranActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngsuran;
    private javax.swing.JButton btnPinjaman;
    private javax.swing.JButton btnSimpanan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtMenuAnggota;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAngsuran() {
        return btnAngsuran;
    }

    public void setBtnAngsuran(JButton btnAngsuran) {
        this.btnAngsuran = btnAngsuran;
    }

    public JButton getBtnPinjaman() {
        return btnPinjaman;
    }

    public void setBtnPinjaman(JButton btnPinjaman) {
        this.btnPinjaman = btnPinjaman;
    }

    public JButton getBtnSimpanan() {
        return btnSimpanan;
    }

    public void setBtnSimpanan(JButton btnSimpanan) {
        this.btnSimpanan = btnSimpanan;
    }

    public void addActionListener(ActionListener x){
        btnSimpanan.addActionListener(x);
        btnAngsuran.addActionListener(x);
        btnPinjaman.addActionListener(x);
    }
    
}
