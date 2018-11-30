package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.view.ViewMenuAnggota;
import koperasisimmpanpinjam.view.ViewMenuSimpanan1;

public class ControllerMenuAnggota {
    private ViewMenuAnggota view;
    private Database db;

    public ControllerMenuAnggota(ViewMenuAnggota view, Database db) {
        this.view = view;
        this.db = db;
        
        this.view.setBtnSimpanan(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               toSimpanan();
            }
        });
    }
    
    public void toSimpanan(){
        ControllerMenuSimpanan simp = new ControllerMenuSimpanan(new ViewMenuSimpanan1, db);
    }
    
    
}
