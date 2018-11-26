package koperasisimmpanpinjam.model;

import java.util.ArrayList;

public class Pinjaman implements Editableiface{
    private String noAnggota;
    private String idPinjaman;
    private double jmlPinjaman;
    private String durasiPinjaman;
    private String tglPinjaman;
    private float bunga;
    private ArrayList<Catatan> catatan;
    private Angsuran angsuran;
    private int jmlAngsuran;
    
    public void pinjaman(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Pinjaman");
        this.angsuran = new Angsuran();
    };

    public Pinjaman(String noAnggota, String idPinjaman, double jmlPinjaman, String durasiPinjaman, String tglPinjaman, float bunga, int jmlAngsuran) {
        this.noAnggota = noAnggota;
        this.idPinjaman = idPinjaman;
        this.jmlPinjaman = jmlPinjaman;
        this.durasiPinjaman = durasiPinjaman;
        this.tglPinjaman = tglPinjaman;
        this.bunga = bunga;
        this.jmlAngsuran = jmlAngsuran;
    }
    
    
    
    public String get_idPinjaman(){
        //PLACEHOLDER
        return null;
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
