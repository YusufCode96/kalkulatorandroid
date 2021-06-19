package com.example.belajar;

import java.io.Serializable;

public class Pengajuan implements Serializable {
    private String pembayaran;
    private String qrcode;

    public Pengajuan(String qrcode,String pembayaran){
        this.pembayaran=pembayaran;
        this.qrcode=qrcode;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public String getQrcode() {
        return qrcode;
    }
}
