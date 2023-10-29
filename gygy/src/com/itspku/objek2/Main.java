package com.itspku.objek2;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");
        Elang.beratHewan(6);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(3);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
