package koperasisimmpanpinjam.controller;


import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import koperasisimmpanpinjam.model.Admin;
import koperasisimmpanpinjam.model.Anggota;
import koperasisimmpanpinjam.model.Angsuran;
import koperasisimmpanpinjam.model.Catatan;
import koperasisimmpanpinjam.model.Login;
import koperasisimmpanpinjam.model.Simpanan;
import koperasisimmpanpinjam.view.Pinjaman;

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Admin> admin = new ArrayList<>();
    private ArrayList<Anggota> anggota = new ArrayList<>();
    private ArrayList<Angsuran> angsuran = new ArrayList<>();
    private ArrayList<Catatan> catatan = new ArrayList<>();
    private ArrayList<Login> login = new ArrayList<>();
    private ArrayList<Pinjaman> pinjaman = new ArrayList<>();
    private ArrayList<Simpanan> simpanan = new ArrayList<>();
    

    public Database() {
        
    }
    
    public void connect(){
        try{
            String url = "jdbc:mysql://localhost/db_Koperasi";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        }catch (SQLException ex){
            System.out.println("Error : "+ex);
        }
    }//end connect
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
    }//end disconect
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        return cek;
    }//end manipulate

    public ArrayList<Admin> getAdmin() {
        return admin;
    }
}
