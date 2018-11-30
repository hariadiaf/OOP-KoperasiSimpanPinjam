package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.view.ViewPinjaman;

public class ControllerPinjaman {
    private ViewPinjaman view;
    private Pinjaman model;

    public ControllerPinjaman(ViewPinjaman view, Pinjaman model) {
        this.view = view;
        this.model = model;
        
        this.view.addPinjamListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }
    
    
}
