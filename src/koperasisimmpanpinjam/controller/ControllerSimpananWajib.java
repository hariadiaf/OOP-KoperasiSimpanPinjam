
package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koperasisimmpanpinjam.model.Simpanan;
import koperasisimmpanpinjam.view.ViewSimpananWajib1;

public class ControllerSimpananWajib  implements ActionListener{
    private ViewSimpananWajib1 view;
    private Database db;
    private Simpanan model;
    private ResultSet rs;
    private String id;
    
    public ControllerSimpananWajib(String id){
        view = new ViewSimpananWajib1();
        view.addActionListener(this);
        db = new Database();
        view.setVisible(true);
    }
    
    public void showView(){
        this.view.setLocationRelativeTo(view);
        this.view.setVisible(true);
    }
    
    public void simpanWajib() throws SQLException{
        db.connect();
        String jumlah = view.getInputJumlahWajib1();
        String tgl = view.getInputTanggal1();
        String Dibayar = view.getInputDibayar();
        String ket = view.getInputKeterangan();
        rs = db.selectedSimpanan("simWajib01");
        int simPokok = 0;
        int simWajib = 0;
        while (rs.next()) {            
            simWajib = Integer.parseInt(jumlah) + Integer.parseInt(rs.getString("Simpanan Wajib"));
        }
        Simpanan sim = new Simpanan(this.id, "simWajib01", Integer.parseInt(jumlah), Integer.parseInt(jumlah), simWajib);
        db.insertDataPokok(sim);
        db.disconnect();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();
        if(source.equals(view.getBtnBayar())){
            try {
                simpanWajib();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerSimpananWajib.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(view.getBtnBackInSimpWajib())){
            new ControllerMenuSimpanan(this.id);
            this.view.dispose();
        }
    }
    
    
}
