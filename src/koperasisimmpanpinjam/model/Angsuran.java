package koperasisimmpanpinjam.model;

import java.util.ArrayList;
import java.util.Date;

public class Angsuran implements Editableiface {
    private String noAnggota;
    private String idAngsuran;
    private double banyakPinjaman;
    private double sisaAngsuran;
    private String idPinjaman;
    private float bunga;
    private Date tglAngsuran;
    private double denda;
    private ArrayList<Catatan> catatan;
    
    public Angsuran(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Angsuran");
    }

    public Angsuran(String noAnggota, String idAngsuran, double banyakPinjaman, double sisaAngsuran, String idPinjaman, float bunga, Date tglAngsuran, double denda) {
        this.noAnggota = noAnggota;
        this.idAngsuran = idAngsuran;
        this.banyakPinjaman = banyakPinjaman;
        this.sisaAngsuran = sisaAngsuran;
        this.idPinjaman = idPinjaman;
        this.bunga = bunga;
        this.tglAngsuran = tglAngsuran;
        this.denda = denda;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getIdAngsuran() {
        return idAngsuran;
    }

    public void setIdAngsuran(String idAngsuran) {
        this.idAngsuran = idAngsuran;
    }

    public double getBanyakPinjaman() {
        return banyakPinjaman;
    }

    public void setBanyakPinjaman(double banyakPinjaman) {
        this.banyakPinjaman = banyakPinjaman;
    }

    public double getSisaAngsuran() {
        return sisaAngsuran;
    }

    public void setSisaAngsuran(double sisaAngsuran) {
        this.sisaAngsuran = sisaAngsuran;
    }

    public String getIdPinjaman() {
        return idPinjaman;
    }

    public void setIdPinjaman(String idPinjaman) {
        this.idPinjaman = idPinjaman;
    }

    public float getBunga() {
        return bunga;
    }

    public void setBunga(float bunga) {
        this.bunga = bunga;
    }

    public Date getTglAngsuran() {
        return tglAngsuran;
    }

    public void setTglAngsuran(Date tglAngsuran) {
        this.tglAngsuran = tglAngsuran;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public ArrayList<Catatan> getCatatan() {
        return catatan;
    }

    public void setCatatan(ArrayList<Catatan> catatan) {
        this.catatan = catatan;
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
