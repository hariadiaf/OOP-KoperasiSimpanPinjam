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
import koperasisimmpanpinjam.model.Pinjaman;
import koperasisimmpanpinjam.model.Simpanan;
import koperasisimmpanpinjam.view.ViewPinjaman;

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
    
    public void loadAdmin() {
        connect();
        try {
            String query = "SELECT * FROM admin";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                admin.add(new Admin(rs.getString("id")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
    
    //DBLoad
    public void loadAnggota() {
        connect();
        try {
            String query = "SELECT * FROM anggota";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                anggota.add(new Anggota(rs.getString("id_anggota"), rs.getString("nama_anggota"), rs.getString("alamat"), rs.getString("status"), rs.getString("tgl_lahir")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
    
        public void loadAngsuran() {
        connect();
        try {
            String query = "SELECT * FROM angsuran";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                angsuran.add(new Angsuran(rs.getString("id_anggota"),rs.getString("id_angsuran"), rs.getDouble("banyak_pinjaman"), rs.getDouble("sisa_angsuran"), rs.getString("id_pinjaman"), rs.getFloat("bunga"), rs.getString("tgl_angsuran"), rs.getDouble("denda")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
        
        public void loadCatatan() {
        connect();
        try {
            String query = "SELECT * FROM catatan";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                catatan.add(new Catatan(rs.getString("id_catatan"),rs.getString("jenis_catatan"),rs.getString("keuangan")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
        
        public void loadLogin() {
        connect();
        try {
            String query = "SELECT * FROM login";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                login.add(new Login(rs.getString("id"),rs.getString("id_anggota"), rs.getString("password"), rs.getString("username")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }

   public void loadPinjaman() {
        connect();
        try {
            String query = "SELECT * FROM pinjaman";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                pinjaman.add(new Pinjaman(rs.getString("id_anggota"),rs.getString("id_pinjaman"), rs.getDouble("jml_pinjaman"), rs.getString("durasi_pinjaman"), rs.getString("tgl_pinjaman"), rs.getFloat("bunga"), rs.getInt("angsuran")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
   
   public void loadSimpanan() {
        connect();
        try {
            String query = "SELECT * FROM simpanan";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                simpanan.add(new Simpanan(rs.getString("id_anggota"),rs.getString("id_simpanan"), rs.getDouble("jml_simpanan"),rs.getDouble("simpanan_pokok"),rs.getDouble("simpanan_wajib")));
            }
        } catch (SQLException ex) {
            System.out.println("Error : "+ex);
        }
        disconnect();
    }
   
   //End DBLoad
   
    public ArrayList<Admin> getAdmin() {
        return admin;
    }
    public ArrayList<Anggota> getAnggota() {
        return anggota;
    }
    public ArrayList<Angsuran> getAngsuran() {
        return angsuran;
    }
    public ArrayList<Catatan> getCatatan() {
        return catatan;
    }
    public ArrayList<Login> getLogin() {
        return login;
    }
    public ArrayList<Pinjaman> getPinjaman() {
        return pinjaman;
    }
    public ArrayList<Simpanan> getSimpanan() {
        return simpanan;
    }
    
    //DBAdd
    public void addAdmin(Admin staff){
        connect();
        String query = "INSERT INTO admin VALUES (";
        query += "'" + staff.getIdAdmin() + "',";
        query += ")";
        
        if (manipulate(query)) admin.add(staff);
        disconnect();
    }
    
    public void addAnggota(Anggota member){
        connect();
        String query = "INSERT INTO anggota VALUES (";
        query += "'" + member.getNoAnggota()+ "',";
        query += "'" + member.getNamaAnggota() + "',";
        query += "'" + member.getAlamat() + "',";
        query += "'" + member.getStatus() + "'";
        query += "'" + member.getTglLahir() + "'";     
        query += ")";

        if (manipulate(query)) anggota.add(member);
        disconnect();
    }
    
    public void addAngsuran(Angsuran angs){
        connect();
        String query = "INSERT INTO angsuran VALUES (";
        query += "'" + angs.getIdAngsuran()+ "',";
        query += "'" + angs.getBanyakPinjaman() + "',";
        query += "'" + angs.getSisaAngsuran() + "',";
        query += "'" + angs.getBunga() + "'";
        query += "'" + angs.getTglAngsuran() + "'";   
        query += "'" + angs.getDenda() + "'";
        query += "'" + angs.getNoAnggota() + "'";
        query += "'" + angs.getTglAngsuran() + "'";
        query += "'" + angs.getIdPinjaman() + "'";
        query += ")";

        if (manipulate(query)) angsuran.add(angs);
        disconnect();
    }
    
    public void addCatatan(Catatan note){
        connect();
        String query = "INSERT INTO catatan VALUES (";
        query += "'" + note.getIdCatatan()+ "',";
        query += "'" + note.getJenisCatatan() + "',";
        query += "'" + note.getKeuangan() + "',";
        query += ")";

        if (manipulate(query)) catatan.add(note);
        disconnect();
    }
    
    public void addLogin(Login masuk){
        connect();
        String query = "INSERT INTO login VALUES (";
        query += "'" + masuk.getUsername()+ "',";
        query += "'" + masuk.getPass() + "',";
        query += "'" + masuk.getNoAnggota() + "',";
        query += "'" + masuk.getIdAdmin() + "'";     
        query += ")";

        if (manipulate(query)) login.add(masuk);
        disconnect();
    }
    
    public void addPinjaman(Pinjaman pinj){
        connect();
        String query = "INSERT INTO pinjaman VALUES (";
        query += "'" + pinj.get_idPinjaman()+ "',";
        query += "'" + pinj.getJmlPinjaman() + "',";
        query += "'" + pinj.getDurasiPinjaman() + "',";
        query += "'" + pinj.getTglPinjaman() + "'";
        query += "'" + pinj.getBunga() + "'"; 
        query += "'" + pinj.getAngsuran() + "'"; 
        query += "'" + pinj.getNoAnggota() + "'"; 
        query += ")";

        if (manipulate(query)) pinjaman.add(pinj);
        disconnect();
    }
    
    public void addSimpanan(Simpanan simp){
        connect();
        String query = "INSERT INTO pinjaman VALUES (";
        query += "'" + simp.getIdSimpanan()+ "',";
        query += "'" + simp.getJumlahSimpanan() + "',";
        query += "'" + simp.getSimpananPokok() + "',";
        query += "'" + simp.getSimpananWajib() + "'";
        query += "'" + simp.getNoAnggota() + "'"; 
        query += ")";

        if (manipulate(query)) simpanan.add(simp);
        disconnect();
    }
    
    //DBDelete
    
    public void delAdmin(String idAdmin){
        connect();
        String query = "DELETE FROM admin WHERE id='" + idAdmin + "'";
        if (manipulate(query)){
            for (Admin adm : admin) {
                if (adm.getIdAdmin().equals(idAdmin)){
                    admin.remove(adm);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delAnggota(String noAnggota){
        connect();
        String query = "DELETE FROM anggota WHERE id='" + noAnggota + "'";
        if (manipulate(query)){
            for (Anggota angg : anggota) {
                if (angg.getNoAnggota().equals(noAnggota)){
                    admin.remove(angg);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delAngsuran(String idAngsuran){
        connect();
        String query = "DELETE FROM angsuran WHERE id='" + idAngsuran + "'";
        if (manipulate(query)){
            for (Angsuran angs : angsuran) {
                if (angs.getIdAngsuran().equals(idAngsuran)){
                    angsuran.remove(angs);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delCatatan(String idCatatan){
        connect();
        String query = "DELETE FROM catatan WHERE id='" + idCatatan + "'";
        if (manipulate(query)){
            for (Catatan note : catatan) {
                if (note.getIdCatatan().equals(idCatatan)){
                    catatan.remove(note);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delLogin( ){
//        connect();
//        String query = "DELETE FROM login WHERE id='" + idAdmin + "'";
//        if (manipulate(query)){
//            for (Admin adm : admin) {
//                if (adm.getIdAdmin().equals(idAdmin)){
//                    admin.remove(adm);
//                    break;
//                }
//            }
//        }
//        disconnect();
    }
    
    public void delPinjaman(String idPinjaman){
        connect();
        String query = "DELETE FROM pinjaman WHERE id='" + idPinjaman + "'";
        if (manipulate(query)){
            for (Pinjaman pinj : pinjaman) {
                if (pinj.get_idPinjaman().equals(idPinjaman)){
                    pinjaman.remove(pinj);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delSimpanan(String idSimpanan){
        connect();
        String query = "DELETE FROM simpanan WHERE id='" + idSimpanan + "'";
        if (manipulate(query)){
            for (Simpanan simp : simpanan) {
                if (simp.getIdSimpanan().equals(idSimpanan)){
                    simpanan.remove(simp);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void updateAdmin(Admin adm){
//        connect();
//        String query = "UPDATE admin SET";
//        query += " nama='" + adm.getNama() + "',";
//        query += " jurusan='" + adm.getJurusan() + "',";
//        query += " jk='" + adm.getJk() + "'";
//        query += " WHERE nim='" + adm.getNim() + "'";
//        if (manipulate(query)){
//            for (Mahasiswa mhs : mahasiswa) {
//                if (mhs.getNim().equals(m.getNim())){
//                    mhs.setNama(m.getNama());
//                    mhs.setJurusan(m.getJurusan());
//                    mhs.setJk(m.getJk());
//                    break;
//                }
//            }
//        }
//        disconnect();
    }
    
    public void updateAnggota(){
        
    }
    
    public void updateAngsuran(){
        
    }
    
    public void updateCatatan(){
        
    }
    
    public void updateLogin(){
        
    }
    
    public void updatePinjaman(){
        
    }
    
    public void updateSimpanan(){
        
    }
}
