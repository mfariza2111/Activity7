package com.example.activity7.Database;

public class teman {
    String id;
    String nama;
    String telpon;

    public teman() {
    }


    public teman(String id, String nama, String telepon) {
        this.id = id;
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telepon) {
        this.telpon = telpon;
    }
}
