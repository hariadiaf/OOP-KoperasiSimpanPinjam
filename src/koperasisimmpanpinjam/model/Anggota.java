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
    
    
    public void menyimpan(){

    };
    public void mengangsur(){

    };
    public void meminjam (){

    };
}