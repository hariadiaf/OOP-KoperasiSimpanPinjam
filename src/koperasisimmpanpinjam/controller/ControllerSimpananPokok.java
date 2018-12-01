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

    public ControllerSimpananPokok() {
        view = new ViewSimpananPokok1();
        view.addActionListener(this);
        db = new Database();
        view.setVisible(true);
    }

    public void simpanPokok() throws SQLException {
        db.connect();
        String jumlah = view.getInputJumlahPokok();
        String tgl = view.getInputTanggalPokok();
        String dibayar = view.getInputDibayarPokok();
        String ket = view.getInputKeteranganPokok();
        rs = db.selectedSimpanan("sim01");
        int simPokok = 0;
        int simWajib = 0;
        while (rs.next()) {
            simPokok = Integer.parseInt(jumlah) + Integer.parseInt(rs.getString("simpanan_pokok"));
        }

        Simpanan sim = new Simpanan("MBR201801", "sim01", Integer.parseInt(jumlah), Integer.parseInt(jumlah), simWajib);
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
                simpanPokok();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerSimpananPokok.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(view.getBtnBackInSimpPokok())){
            new ControllerMenuSimpanan();
            this.view.dispose();
        }
    }
}
