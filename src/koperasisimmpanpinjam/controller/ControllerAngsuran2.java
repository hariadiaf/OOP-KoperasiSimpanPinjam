package koperasisimmpanpinjam.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import koperasisimmpanpinjam.model.Angsuran;
import koperasisimmpanpinjam.view.ViewAngsuran2;

public class ControllerAngsuran2 {

    private ViewAngsuran2 viewDetail;
    private Database db;
    private Angsuran model;
    private ResultSet rs;
    private String id;
    public ControllerAngsuran2(String id) {
        viewDetail = new ViewAngsuran2();
        this.id = id;
        db = new Database();
        lookDetail(id);
        System.out.println("ID : "+id);
        viewDetail.setVisible(true);

    }
        public void lookDetail(String id) {
        rs = db.selectedAngsuran(id);
        try {
            while (rs.next()) {
                viewDetail.setTglAngsuran(rs.getString("tgl_angsuran"));
                viewDetail.setInputAngsuran(rs.getString("banyak_pinjaman"));
            }
        } catch (SQLException e) {
            System.err.println("Error : "+e.getErrorCode());
        }
            System.out.println("Masuk : "+id);
    }
}
