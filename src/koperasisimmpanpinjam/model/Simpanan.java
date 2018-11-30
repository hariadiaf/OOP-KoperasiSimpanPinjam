package koperasisimmpanpinjam.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Simpanan implements Editableiface {
    private String noAnggota;
    private String idSimpanan;
    private double jumlahSimpanan;
    private double simpananPokok;
    private double simpananWajib;
    private ResultSet rs;
    private ArrayList<Catatan> catatan;

    public void simpanan(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Simpanan");
    }

    public Simpanan(String noAnggota, String idSimpanan, double jumlahSimpanan, double simpananPokok, double simpananWajib) {
        this.noAnggota = noAnggota;
        this.idSimpanan = idSimpanan;
        this.jumlahSimpanan = jumlahSimpanan;
        this.simpananPokok = simpananPokok;
        this.simpananWajib = simpananWajib;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getIdSimpanan() {
        return idSimpanan;
    }

    public void setIdSimpanan(String idSimpanan) {
        this.idSimpanan = idSimpanan;
    }

    public double getJumlahSimpanan() {
        return jumlahSimpanan;
    }

    public void setJumlahSimpanan(double jumlahSimpanan) {
        this.jumlahSimpanan = jumlahSimpanan;
    }

    public double getSimpananPokok() {
        return simpananPokok;
    }

    public void setSimpananPokok(double simpananPokok) {
        this.simpananPokok = simpananPokok;
    }

    public double getSimpananWajib() {
        return simpananWajib;
    }

    public void setSimpananWajib(double simpananWajib) {
        this.simpananWajib = simpananWajib;
    }
    
        

    @Override
    public void simpan(String id, double jumlah)
    {
        catatan.add(new Catatan());
    };
    
    public String get_idSimpanan(){
        //placeholder
        return null;
    };
    
    public void set_idSimpanan(String idSimpanan){

        this.idSimpanan = idSimpanan;
    };

    @Override
    public void edit(String id, double jumlah){
        int idx=-1;
        for (int i = 0; i < catatan.size() ; i++) {
            if (catatan.get(i).getIdCatatan().equals(id)){
                 idx = i;
            }
        }
        if (idx!=-1){
            catatan.get(idx);
        }
    };
    
    @Override
    public void update(){
    
    };
    
    @Override
    public void delete(){
    
    };
}
