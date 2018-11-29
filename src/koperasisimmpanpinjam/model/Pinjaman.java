package koperasisimmpanpinjam.model;

import java.sql.Date;
import java.util.ArrayList;

public class Pinjaman implements Editableiface{
    private String noAnggota;
    private String idPinjaman;
    private double jmlPinjaman;
    private String durasiPinjaman;
    private Date tglPinjaman;
    private float bunga;
    private ArrayList<Catatan> catatan;
    private int angsuran;
    private int jmlAngsuran;
    
    public void pinjaman(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Pinjaman");
    };

    public Pinjaman(String noAnggota, String idPinjaman, double jmlPinjaman, String durasiPinjaman, Date tglPinjaman, float bunga, int angsuran) {
        this.noAnggota = noAnggota;
        this.idPinjaman = idPinjaman;
        this.jmlPinjaman = jmlPinjaman;
        this.durasiPinjaman = durasiPinjaman;
        this.tglPinjaman = tglPinjaman;
        this.bunga = bunga;
        this.angsuran = angsuran;
    }

   

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public double getJmlPinjaman() {
        return jmlPinjaman;
    }

    public void setJmlPinjaman(double jmlPinjaman) {
        this.jmlPinjaman = jmlPinjaman;
    }

    public String getDurasiPinjaman() {
        return durasiPinjaman;
    }

    public void setDurasiPinjaman(String durasiPinjaman) {
        this.durasiPinjaman = durasiPinjaman;
    }

    public Date getTglPinjaman() {
        return tglPinjaman;
    }

    public void setTglPinjaman(Date tglPinjaman) {
        this.tglPinjaman = tglPinjaman;
    }

    public float getBunga() {
        return bunga;
    }

    public void setBunga(float bunga) {
        this.bunga = bunga;
    }

    public int getAngsuran() {
        return angsuran;
    }

    public void setAngsuran(int angsuran) {
        this.angsuran = angsuran;
    }
    
    public String get_idPinjaman(){
        //PLACEHOLDER
        return idPinjaman;
    }
    
    public void set_idPinjaman(String idPinjaman){

        this.idPinjaman = idPinjaman;
    }
    
    @Override
    public void simpan(String id, double jumlah) {

    }

    @Override
    public void edit(String id, double jumlah) {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
    
    
}
