
package koperasisimmpanpinjam.controller;

import koperasisimmpanpinjam.model.Simpanan;
import koperasisimmpanpinjam.view.ViewSimpananWajib1;

public class ControllerSimpananWajib {
    private ViewSimpananWajib1 view;
    private Database db;
    private Simpanan model;
    
    public ControllerSimpananWajib(){
        view = new ViewSimpananWajib1();
        db = new Database();
        view.setVisible(true);
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(view);
        this.view.setVisible(true);
    }
}
