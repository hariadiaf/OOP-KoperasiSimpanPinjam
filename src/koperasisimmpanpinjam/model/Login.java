package koperasisimmpanpinjam.model;

public class Login {
    private String idAdmin;
    private String noAnggota;
    private String pass;
    private String username;

    public Login(String idAdmin, String noAnggota ,String pass, String username) {
        this.idAdmin = idAdmin;
        this.noAnggota = noAnggota;
        this.pass = pass;
        this.username = username;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    public void input(){

    };
    public void masuk(){

    };
    
}
