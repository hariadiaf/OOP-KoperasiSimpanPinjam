/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam;

import java.util.ArrayList;

    public class Simpanan implements Editableiface {
    private String noAnggota;
    private String idSimpanan;
    private double jumlahSimpanan;
    private double simpananPokok;
    private double simpananWajib;
    
    private ArrayList<Catatan> catatan;

    public void simpanan(){
        this.catatan = new ArrayList<>();
        catatan.add(new Catatan());
        catatan.get(0).set_jenisCatatan("Simpanan");
    }

    @Override
    public void simpan(String id, double jumlah){
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
