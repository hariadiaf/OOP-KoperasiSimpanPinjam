package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import koperasisimmpanpinjam.model.Admin;
import koperasisimmpanpinjam.model.Anggota;
import koperasisimmpanpinjam.view.ViewAdmin;

public class ControllerAdmin extends Database{
    private ViewAdmin view;
    //private Anggota model1;
    //private Admin model2;
    private Database db;

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
    }
    
    public void loadMember(){
        DefaultTableModel dtm = new DefaultTableModel(new String[]{"id Anggota","Nama","Status","Tanggal Lahir"},0);
        loadAnggota();
        for(Anggota a : this.getAnggota()){
            dtm.addRow(new Object[]{a.getNoAnggota(),a.getNamaAnggota(),a.getStatus(),a.getTglLahir()});
        }
        this.view.settAnggota(dtm);
    }
    
    
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
    
}
