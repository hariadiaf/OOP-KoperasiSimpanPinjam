package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.view.ViewAngsuran1;
import koperasisimmpanpinjam.view.ViewMenuAnggota;
import koperasisimmpanpinjam.view.ViewMenuSimpanan1;
import koperasisimmpanpinjam.view.ViewPinjaman;

public class ControllerMenuAnggota implements ActionListener{
    private ViewMenuAnggota view;
    private Database db;

    public ControllerMenuAnggota() {
        view = new ViewMenuAnggota();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
//        this.view.setBtnSimpanan(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               toSimpanan();
//            }
//        });
    }
    
    public void toSimpanan(){
       ViewMenuSimpanan1 simpan = new ViewMenuSimpanan1();
       simpan.setVisible(true);
    }
    
    public void toPinjaman(){
        ViewPinjaman pinjam = new ViewPinjaman();
        pinjam.setVisible(true);
    }
    
    public void toAngsuran(){
        ViewAngsuran1 angsur = new ViewAngsuran1();
        angsur.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       if(source.equals(view.getBtnSimpanan())){
           toSimpanan();
          
       }
    }
    
    
    
    
}
