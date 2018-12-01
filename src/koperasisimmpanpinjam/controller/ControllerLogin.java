package koperasisimmpanpinjam.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koperasisimmpanpinjam.model.Login;
import koperasisimmpanpinjam.view.ViewLoginKoperasi;

public class ControllerLogin {

    private ViewLoginKoperasi view;
    private Database db;
    private Login masuk;
    private ResultSet rs;
    public String id_anggota;

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public ControllerLogin() {
        view = new ViewLoginKoperasi();
        db = new Database();
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //           toAnggota();
                    masuk();
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
        view.setVisible(true);
    }

    public void toAdmin() {
        new ControllerAdmin();
        this.view.dispose();
    }

    public void toAnggota() {
        new ControllerMenuAnggota(this);
        this.view.dispose();
    }

    public void masuk() throws SQLException {
        db.connect();
        String username = view.getInputUsername();
        String password = view.getInputPassword();
        doLogin(username, password);
    }

    public void doLogin(String username, String password) throws SQLException {
        try {
            if (username.isEmpty() || password.isEmpty()) {
                view.showMessage("Username atau Password kosong", "Login", 0);
            } else {
                ResultSet rs = db.selectedLogin(username, password);

                if (rs.next()) {
                    if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                        if  ((username.equals("admin") ) && (password.equals("admin"))) {
                            view.dispose();
                            new ControllerAdmin();
                        } else {
                            view.dispose();
                            id_anggota = rs.getString("id_anggota");
                            System.out.println(id_anggota);
                            new ControllerMenuAnggota(this);
                            view.showMessage("Login Berhasil", "Login", 1);
                        }

                    }

                } else {
                    System.out.println(username + " " + password);
                    System.out.println(username.compareTo("admin"));
                    System.out.println(password.compareTo("admin"));
                    view.showMessage("Username atau Password salah", "Login", 0);

                }

                db.disconnect();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            view.dispose();
        }
    }
}
