package koperasisimmpanpinjam.model;

public class Anggota {
    private String noAnggota;
    private String namaAnggota;
    private String Alamat;
    private String Status;
    private String TglLahir;

    public Anggota(String noAnggota, String namaAnggota, String Alamat, String Status, String TglLahir) {
        this.noAnggota = noAnggota;
        this.namaAnggota = namaAnggota;
        this.Alamat = Alamat;
        this.Status = Status;
        this.TglLahir = TglLahir;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTglLahir() {
        return TglLahir;
    }

    public void setTglLahir(String TglLahir) {
        this.TglLahir = TglLahir;
    }
    
    
    
    public void menyimpan(){

    };
    public void mengangsur(){

    };
    public void meminjam (){

    };
}