package koperasisimmpanpinjam.model;


import java.util.ArrayList;

public class Angsuran implements Editableiface {
    private String noAnggota;
    private String idAngsuran;
    private double banyakPinjaman;
    private double sisaAngsuran;
    private String idPinjaman;
    private float bunga;
    private String tglAngsuran;
    private double denda;
    private ArrayList<Catatan> catatan;
    
    public Angsuran(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Angsuran");
    }

    public Angsuran(String noAnggota, String idAngsuran, double banyakPinjaman, double sisaAngsuran, String idPinjaman, float bunga, String tglAngsuran, double denda) {
        this.noAnggota = noAnggota;
        this.idAngsuran = idAngsuran;
        this.banyakPinjaman = banyakPinjaman;
        this.sisaAngsuran = sisaAngsuran;
        this.idPinjaman = idPinjaman;
        this.bunga = bunga;
        this.tglAngsuran = tglAngsuran;
        this.denda = denda;
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
