package koperasisimmpanpinjam.controller;

import java.sql.Date;
import koperasisimmpanpinjam.model.Admin;
import koperasisimmpanpinjam.model.Anggota;
import koperasisimmpanpinjam.model.Angsuran;
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.view.ViewAdmin;

public class DriverKoperasiSimmpanPinjam {
    public static void main(String[] args) {

      
        Database database = new Database();
        //database.addAngsuran(new Angsuran("MBR201801", "ANG201801", 1000000f, 1000000f, "PIN201801", 0.05f, new Date(2018-1900, 11-1, 29), 0));
        //System.out.println("Hasil List : "+database.getAngsuran().size());
        ControllerAdmin cAdmin = new ControllerAdmin(new ViewAdmin());
        cAdmin.showView();
        
    }
    
}
