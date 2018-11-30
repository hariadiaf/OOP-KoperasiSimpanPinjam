package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import koperasisimmpanpinjam.model.Admin;
import koperasisimmpanpinjam.model.Anggota;
import koperasisimmpanpinjam.view.ViewAdmin;
import koperasisimmpanpinjam.view.ViewAdminDetail;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.model.Simpanan;

public class ControllerAdmin extends Database {

    private ViewAdmin view;
    private Database db;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

    public ControllerAdmin(ViewAdmin view) {
        this.view = view;
        //this.model1 = model1;
        //this.model2 = model2;
        loadMember();
        this.view.addHapusListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delAnggota(view.getSelectedId());
                ArrayList<Anggota> ar = getAnggota();
                ar.clear();
                setAnggota(ar);
                loadMember();
            }
        });
        this.view.addDetailListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (getInfoAnggota() != null) {
                        toDetailAnggota(getInfoAnggota());
                    }else{
                        System.out.println("Tidak ada baris yang dipilih");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE,null,ex);
                }
            
        }
        });
    };

    ControllerAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void toDetailAnggota(Anggota a) {
        ViewAdminDetail aView = new ViewAdminDetail();
        Simpanan as = findSimpananAnggota(a.getNoAnggota());
        Pinjaman ps = findPinjamanAnggota(a.getNoAnggota());
        double d = as.getJumlahSimpanan();
        double p = ps.getJmlPinjaman();
        String jmlSimpanan = d+"";
        String jmlPinjaman = p+"";
        
        aView.setTfIdAnggota(a.getNoAnggota());
        aView.setTfNamaAnggota(a.getNamaAnggota());
        aView.setTfAlamat(a.getAlamat());
        aView.setTfStatus(a.getStatus());
        String strDate = dateFormat.format(a.getTglLahir());
        aView.setTfTTL(strDate);
        aView.setTfJmlSimpanan(jmlSimpanan);
        aView.setTfJmlPinjaman(jmlPinjaman);
        
        //aView.show();
        
        ControllerAdminDetail adm = new ControllerAdminDetail(aView);
        adm.showView();
        this.view.dispose();
        System.out.println("disposed");

    };

    public Anggota getInfoAnggota() throws SQLException {
        String id = this.view.getSelectedId();
        Anggota a = findAnggota(id);
        
        return a;
    };

    public void loadMember() {
        DefaultTableModel dtm = new DefaultTableModel(new String[]{"id Anggota", "Nama", "Status", "Tanggal Lahir"}, 0);
        loadAnggota();
        for (Anggota a : this.getAnggota()) {
            dtm.addRow(new Object[]{a.getNoAnggota(), a.getNamaAnggota(), a.getStatus(), a.getTglLahir()});
        }
        this.view.settAnggota(dtm);
    }
    

    public void showView() {
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }

}
