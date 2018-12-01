package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import koperasisimmpanpinjam.model.Angsuran;
import koperasisimmpanpinjam.view.ViewAngsuran1;
import koperasisimmpanpinjam.view.ViewAngsuran2;

public class ControllerAngsuran1 extends MouseAdapter implements ActionListener {

    private ViewAngsuran1 view;
    private ViewAngsuran2 viewDetail;
    private Database db;
    private Angsuran model;
    private ResultSet rs;
    private DefaultTableModel dtm;

    public ControllerAngsuran1() {
        view = new ViewAngsuran1();
        db = new Database();
        loadTable();
        view.setVisible(true);
        view.addActionListener(this);
    }

    public void showViews() {
        this.view.setLocationRelativeTo(view);
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        view = new ViewAngsuran1();
//        db = new Database();
//        view.addActionListener(this);
//        view.addMouseAdapter(this);
//        view.setVisible(true);
        int row = view.getSelectedMahasiswa();
        String id = view.getTbMahasiswa().getModel().getValueAt(row, 1).toString();
        Object source = e.getSource();
        if (source.equals(view.getBtnDetailAngsuran())) {
            new ControllerAngsuran2(id);

        }
    }

    public void deleteAngsuran1() throws SQLException {
        db.connect();
        int row = view.getSelectedMahasiswa();
        String id = view.getTbMahasiswa().getModel().getValueAt(row, 0).toString();
        db.delAngsuran(id);
    }

    public void updateAngsuran1() throws SQLException {
        db.connect();
        int row = view.getSelectedMahasiswa();
        String id = view.getTbMahasiswa().getModel().getValueAt(row, 0).toString();
        rs = db.selectedAngsuran(id);

//        Angsuran angsur = new Angsuran("MBR201801", "ANG201801", Double.parseDouble(banyakPinjaman), Double.parseDouble(sisaAngsuran), "PIN001", 0.05f, new Date(row, row, row), 0);
//        db.updateAngsuran(angsur);
    }

    public void loadTable() {
        db.loadAngsuran();
        dtm = new DefaultTableModel(new String[]{"ID Anggota", "ID Angsuran", "Banyak Pinjaman", "Sisa angsuran", "Bunga", "tgl angsuran", "denda"}, 0);
        ArrayList<Angsuran> angsuran = db.getAngsuran();
        for (Angsuran angsur : angsuran) {
            dtm.addRow(new Object[]{angsur.getNoAnggota(), angsur.getIdAngsuran(), angsur.getBanyakPinjaman(), angsur.getSisaAngsuran(), angsur.getBunga(), angsur.getTglAngsuran(), angsur.getDenda()});
        }
        view.setTbMahasiswa(dtm);
    }


}
