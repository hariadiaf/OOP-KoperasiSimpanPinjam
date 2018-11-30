package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import koperasisimmpanpinjam.view.ViewMenuSimpanan1;

public class ControllerMenuSimpanan {
    private ViewMenuSimpanan1 view;
    private Database db;

    public ControllerMenuSimpanan(ViewMenuSimpanan1 view, Database db) {
        this.view = view;
        this.db = db;
        
        this.view.setBtnSimpananPokok(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        });
    }
    
    
}
