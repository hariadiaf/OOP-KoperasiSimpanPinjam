package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koperasisimmpanpinjam.model.Simpanan;
import koperasisimmpanpinjam.view.ViewSimpananPokok1;

public class ControllerSimpananPokok implements ActionListener{

    private ViewSimpananPokok1 view;
    private Database db;
    private Simpanan model;
    private ResultSet rs;
    private ControllerLogin cLogin;

    public ControllerSimpananPokok(ControllerLogin cLogin) {
        view = new ViewSimpananPokok1();
        view.addActionListener(this);
        this.cLogin = cLogin;
        db = new Database();
        view.setVisible(true);
    }

    public void simpanPokok(String id_anggota) throws SQLException {
        db.connect();
        String jumlah = view.getInputJumlahPokok();
        String tgl = view.getInputTanggalPokok();
        String dibayar = view.getInputDibayarPokok();
        String ket = view.getInputKeteranganPokok();
        rs = db.selectedSimpanan(id_anggota);
        int simPokok = 0;
        int simWajib = 0;
        while (rs.next()) {
            simPokok = Integer.parseInt(jumlah) + Integer.parseInt(rs.getString("simpanan_pokok"));
        }
        int id = (int)(Math.random() * 100) + 1;
        String idSim = "SIM"+String.valueOf(id);
        Simpanan sim = new Simpanan(id_anggota, idSim, Integer.parseInt(jumlah), Integer.parseInt(jumlah), simWajib);
        db.insertDataPokok(sim);
        db.disconnect();
    }

    public void showViews() {
        this.view.setLocationRelativeTo(view);
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnBayarPokok())){
            try {
                simpanPokok(cLogin.getId_anggota());
                System.out.println(cLogin.id_anggota);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerSimpananPokok.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(view.getBtnBackInSimpPokok())){
            new ControllerMenuSimpanan(cLogin);
            this.view.dispose();
        }
    }
}
