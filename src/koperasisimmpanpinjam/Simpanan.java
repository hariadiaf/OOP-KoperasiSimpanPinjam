/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam;

/**
 *
 * @author Yazid
 */
public class Simpanan implements Editableiface {
    private String noAnggota;
    private String idSimpanan;
    private double jumlahSimpanan;
    private double simpananPokok;
    private double simpananWajib;
    
    private Catatan catatan;

    public void simpanan(){
        this.catatan = new Catatan();
        catatan.set_jenisCatatan("Simpanan");
    }
    
    @Override
    public void simpan(){
        
    };
    
    public String get_idSimpanan(){
        //placeholder
        return null;
    };
    
    public void set_idSimpanan(String idSimpanan){

        this.idSimpanan = idSimpanan;
    };
    
    @Override
    public void edit(){
    
    };
    
    @Override
    public void update(){
    
    };
    
    @Override
    public void delete(){
    
    };
}
