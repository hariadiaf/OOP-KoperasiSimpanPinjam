/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimmpanpinjam.model;

public interface Editableiface {

    public void simpan(String id, double jumlah);
    public void edit(String id, double jumlah);
    public void update();
    public void delete();
}
