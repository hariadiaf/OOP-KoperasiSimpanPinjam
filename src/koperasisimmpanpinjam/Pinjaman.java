/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam;

import java.util.ArrayList;

public class Pinjaman implements Editableiface{
    private String noAnggota;
    private String idPinjaman;
    private double jmlPinjaman;
    private String durasinPinjaman;
    private String tglPinjaman;
    private float bunga;
    
    private ArrayList<Catatan> catatan;
    private Angsuran angsuran;
    
    public void pinjaman(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Pinjaman");
        this.angsuran = new Angsuran();
        
    };
    
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
