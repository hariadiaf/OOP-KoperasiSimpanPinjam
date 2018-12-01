package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import koperasisimmpanpinjam.view.ViewAdminDetail;
import koperasisimmpanpinjam.view.ViewAdmin;

public class ControllerAdminDetail extends Database {

    private ViewAdminDetail view;

    public ControllerAdminDetail(ViewAdminDetail view) {
        this.view = view;

        this.view.addKembaliListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    toAnggotaList();
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAdminDetail.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        });
    }

    public void toAnggotaList() throws SQLException {
        System.out.println("kembali");
        ControllerAdmin ad = new ControllerAdmin(new ViewAdmin());
        ad.showView();
        this.view.dispose();
    }

    public void showView() {
        this.view.setLocationRelativeTo(null);
        this.view.show();
    }

    public void loadDetailAnggota() {
        

    }
}
