package koperasisimmpanpinjam.model;

public class Catatan {
    private String idCatatan;
    private String jenisCatatan;
    private String keuangan;
    
//konstruktor
    public Catatan(String idCatatan, String jenisCatatan, String keuangan) {
        this.idCatatan = idCatatan;
        this.jenisCatatan = jenisCatatan;
        this.keuangan = keuangan;
    }

    public Catatan() {
    }

    
//end konstruktor
    
    public String get_jenisCatatan(){
        return null;
    }

    public String getIdCatatan() {
        return idCatatan;
    }

    public void set_jenisCatatan(String jenisCatatan){
        this.jenisCatatan = jenisCatatan;
    }

}
