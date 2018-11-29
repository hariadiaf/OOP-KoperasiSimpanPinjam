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
        view.addActionListener(this);
        view.setVisible(true);
        
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}
