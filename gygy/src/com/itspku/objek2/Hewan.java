package com.itspku.objek2;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan){
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("Nama hewan: : " + nama);
        System.out.println("Berat hewan: : " + berat);
        System.out.println("Jumlah kaki hewan: : " + jumlahKaki);
    }
}
