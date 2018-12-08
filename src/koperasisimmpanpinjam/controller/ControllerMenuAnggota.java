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
    private ControllerLogin cLogin;

    public ControllerMenuAnggota(ControllerLogin cLogin) {
        view = new ViewMenuAnggota();
        db = new Database();
        this.cLogin = cLogin;
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
       new ControllerMenuSimpanan(cLogin);
       this.view.dispose();
    }
    
    public void toPinjaman(){
        new ControllerPinjaman(cLogin.getId_anggota());
        this.view.dispose();
        
    }
    
    public void toAngsuran(){
//        ViewAngsuran1 angsur = new ViewAngsuran1();
//        angsur.setVisible(true);
        new ControllerAngsuran1(cLogin);
        this.view.dispose();
    }
    
    public void toLogOut(){
        new ControllerLogin();
        this.view.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       if(source.equals(view.getBtnSimpanan())){
           toSimpanan();
       }else if (source.equals(view.getBtnPinjaman())){
           toPinjaman();
       }else if(source.equals(view.getBtnAngsuran())){
           toAngsuran();
       }else if(source.equals(view.getBtnLogOutAnggota())){
           toLogOut();
       }
    } 
}
