package koperasisimmpanpinjam.controller;

import java.sql.Date;
import koperasisimmpanpinjam.model.Admin;
import koperasisimmpanpinjam.model.Anggota;
import koperasisimmpanpinjam.model.Angsuran;

public class DriverKoperasiSimmpanPinjam {
    public static void main(String[] args) {

        Database database = new Database();
        database.addAngsuran(new Angsuran("MBR201801", "AGS201801", 1000000, 800000, "MBR201801", 0.05f, new Date(2018-1900, 11, 28), 0));
        System.out.println("Hasil List : "+database.getAngsuran().size());
        
    }
    
}
