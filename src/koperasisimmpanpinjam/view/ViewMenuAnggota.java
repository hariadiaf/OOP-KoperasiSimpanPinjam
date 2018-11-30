package koperasisimmpanpinjam.view;

import java.awt.event.ActionListener;
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
        btnSimpanan = new javax.swing.JToggleButton();
        btnPinjaman = new javax.swing.JToggleButton();
        btnAngsuran = new javax.swing.JToggleButton();
        txtMenuAnggota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 90, 79));

        jPanel2.setBackground(new java.awt.Color(44, 73, 117));

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

        btnSimpanan.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnSimpanan.setText("Simpanan");
        btnSimpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpananActionPerformed(evt);
            }
        });

        btnPinjaman.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnPinjaman.setText("Pinjaman");

        btnAngsuran.setFont(new java.awt.Font("Roboto", 0, 64)); // NOI18N
        btnAngsuran.setText("Angsuran");

        txtMenuAnggota.setBackground(new java.awt.Color(255, 255, 255));
        txtMenuAnggota.setFont(new java.awt.Font("Roboto", 1, 64)); // NOI18N
        txtMenuAnggota.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuAnggota.setText("Menu Anggota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMenuAnggota)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(txtMenuAnggota)
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpananActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAngsuran;
    private javax.swing.JToggleButton btnPinjaman;
    private javax.swing.JToggleButton btnSimpanan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtMenuAnggota;
    // End of variables declaration//GEN-END:variables

    public void addAngsuranListener(ActionListener x) {
        btnAngsuran.addActionListener(x);
    }

    public void addPinjamanListener(ActionListener x) {
        btnPinjaman.addActionListener(x);
    }

    public void addSimpanListener(ActionListener x) {
        btnSimpanan.addActionListener(x);
    }

    public JToggleButton getBtnAngsuran() {
        return btnAngsuran;
    }

    public void setBtnAngsuran(JToggleButton btnAngsuran) {
        this.btnAngsuran = btnAngsuran;
    }

    public JToggleButton getBtnPinjaman() {
        return btnPinjaman;
    }

    public void setBtnPinjaman(JToggleButton btnPinjaman) {
        this.btnPinjaman = btnPinjaman;
    }

    public JToggleButton getBtnSimpanan() {
        return btnSimpanan;
    }

    public void setBtnSimpanan(ActionListener btnSimpanan) {
        this.btnSimpanan.addActionListener(btnSimpanan);
    }
    
}
