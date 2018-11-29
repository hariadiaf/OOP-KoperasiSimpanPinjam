package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import koperasisimmpanpinjam.model.Login;
import koperasisimmpanpinjam.view.ViewLoginKoperasi;

public class ControllerLogin extends Database{
    private ViewLoginKoperasi view;

<<<<<<< HEAD
    public ControllerLogin(ViewLoginKoperasi view){
        this.view = view;
        this.view.addLoginListener(new ActionListener() {  //buat anonymous class dengan menginstansiasi actionListener baru !!!!!!
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        }); 
=======
    public ControllerLogin(){
        view = new ViewLoginKoperasi();
        db = new Database();
        view.addLoginListener(this);
        view.setVisible(true);
        
>>>>>>> origin/master
    }
   
    
}


