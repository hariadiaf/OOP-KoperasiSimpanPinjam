package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.view.ViewPinjaman;

public class ControllerPinjaman implements ActionListener {

    private ViewPinjaman view;
    private Pinjaman model;
    private Database db;
    private ResultSet rs;
    private ControllerLogin cLogin;

    public ControllerPinjaman(ControllerLogin cLogin) {
        view = new ViewPinjaman();
        db = new Database();
        view.setVisible(true);
        this.cLogin = cLogin;
        view.addActionListener(this);

//        this.view.addPinjamListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        });
    }

    public void showView() {
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }

    private static long daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    public void Pinjam() throws SQLException {
        try {
            db.connect();
            String jmlPinjaman = view.getInputBesarPinjaman();
            String tglPinjam = view.getInputTglPinjam();
            String[] tglPinj = tglPinjam.split("/");
            Date tPinjam = new Date(Integer.valueOf(tglPinj[2]),Integer.valueOf(tglPinj[1]),Integer.valueOf(tglPinj[0]));
            String tglBayar = view.getInputTglBayar();
            String[] tglByr = tglBayar.split("/");
            Date tBayar = new Date(Integer.valueOf(tglByr[2]),Integer.valueOf(tglByr[1]),Integer.valueOf(tglByr[0]));
            String tujuan = view.getInputNamaPinjPinjaman();
            long durasi = daysBetween(tPinjam, tBayar);
            float bunga = 0.05f;
            int angsuran = 0;

//        rs = db.selectedPinjaman("PIN201802");
            Pinjaman pinjam = new Pinjaman("MBR001", "PIN002", Double.parseDouble(jmlPinjaman), String.valueOf(durasi), tPinjam, bunga, angsuran, "namaPinjaman");
            db.addPinjaman(pinjam);
        } catch (NumberFormatException e) {
            System.err.println("error : " + e.getMessage());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnPinjam())) {
            try {
                Pinjam();
                System.out.println("test");
            } catch (SQLException ex) {
                Logger.getLogger(ControllerPinjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (source.equals(view.getBtnBackInPinj())) {
            new ControllerMenuAnggota(cLogin);
            this.view.dispose();
        }
    }

}
