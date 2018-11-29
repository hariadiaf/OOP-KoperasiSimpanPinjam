package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import koperasisimmpanpinjam.model.Login;
import koperasisimmpanpinjam.view.ViewLoginKoperasi;

public class ControllerLogin implements ActionListener{
    private ViewLoginKoperasi view;
    private Database db;

    public ControllerLogin(){
        view = new ViewLoginKoperasi();
        db = new Database();
        view.addLoginListener(this);
        view.setVisible(true);
        
    }
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())){
            BtnLoginActionPerformed();
        }
    }

    private void BtnLoginActionPerformed() {
//        Database db = new Database();
//        db.
    }
    
    
}


