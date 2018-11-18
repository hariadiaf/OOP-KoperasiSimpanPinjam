/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam;


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
