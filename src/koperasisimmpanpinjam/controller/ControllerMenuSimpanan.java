package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.view.ViewMenuAnggota;
import koperasisimmpanpinjam.view.ViewMenuSimpanan1;
import koperasisimmpanpinjam.view.ViewSimpananPokok1;
import koperasisimmpanpinjam.view.ViewSimpananWajib1;

public class ControllerMenuSimpanan implements ActionListener{
    private ViewMenuSimpanan1 view;
    private Database db;

    public ControllerMenuSimpanan() {
        view = new ViewMenuSimpanan1();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    public void ShowView(){
//        this.view;
    }
    
    public void toSimpananPokok(){
//        ViewSimpananPokok1 pokok = new ViewSimpananPokok1();
//        pokok.setVisible(true);
        new ControllerSimpananPokok();
        this.view.dispose();
    }
    
    public void toSimpananWajib(){
       new ControllerSimpananWajib();
        this.view.dispose();
    }
    
    public void toMenuAnggota(){
        new ControllerMenuAnggota();
        this.view.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnBackMenuSimp())){
            toMenuAnggota();
            //System.out.println("sawadikap");
        }else if(source.equals(view.getBtnSimpananPokok())){
            toSimpananPokok();
        }else if(source.equals(view.getBtnSimpananWajib())){
            toSimpananWajib();
        }
    }
}
