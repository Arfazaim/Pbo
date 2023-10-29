package com.istpku.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 8;
        double l = 5.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasil luas adalah "+hasil);
    }
    private static double hitungLuas(double panjang, double lebar){
        double luas = panjang*lebar;
        return luas;
    }
}
