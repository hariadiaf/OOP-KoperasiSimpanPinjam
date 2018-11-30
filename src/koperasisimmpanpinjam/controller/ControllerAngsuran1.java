package koperasisimmpanpinjam.controller;

import koperasisimmpanpinjam.model.Angsuran;
import koperasisimmpanpinjam.view.ViewAngsuran1;

public class ControllerAngsuran1 {
    private ViewAngsuran1 view;
    private Database db;
    private Angsuran model;
    
    public ControllerAngsuran1(){
        view = new ViewAngsuran1();
        db = new Database();
        view.setVisible(true);
    }
    
    public void showViews(){
        this.view.setLocationRelativeTo(view);
        this.view.setVisible(true);
    }
}
