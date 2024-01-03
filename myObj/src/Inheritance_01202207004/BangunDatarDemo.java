package Inheritance_01202207004;

public class BangunDatarDemo {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 20);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(30, 40);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
