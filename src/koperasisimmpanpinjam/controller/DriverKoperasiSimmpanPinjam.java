package koperasisimmpanpinjam.controller;

public class DriverKoperasiSimmpanPinjam {
    public static void main(String[] args) {

        Database database = new Database();
        database.connect();
        
        database.disconnect();
    }
    
}
