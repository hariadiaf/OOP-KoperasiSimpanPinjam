/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam;


public class Angsuran implements Editableiface {
    private String noAnggota;
    private String idAngsuran;
    private double banyakPinjaman;
    private double sisaAngsuran;
    private String idPinjaman;
    private float bunga;
    private String tglAngsuran;
    private double denda;
    private Catatan catatan;
    
    public Angsuran(){
        this.catatan = new Catatan();
        catatan.set_jenisCatatan("Angsuran");
    }


    @Override
    public void simpan() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
