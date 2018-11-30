package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.view.ViewPinjaman;

public class ControllerPinjaman {
    private ViewPinjaman view;
    private Pinjaman model;
    private Database db;

    public ControllerPinjaman() {
        view = new ViewPinjaman();
        db = new Database();
        view.setVisible(true);
        
//        this.view.addPinjamListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        });
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    
    
}
