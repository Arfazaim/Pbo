package TugasM6;

public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();
        mobilSaya.merk = "Toyota";
        mobilSaya.warna = "Hitam";
        mobilSaya.kecepatan = 60;

        mobilSaya.tampilkanInfo();

        mobilSaya.tambahKecepatan(20);
        mobilSaya.tampilkanInfo();

        mobilSaya.kurangiKecepatan(10);
        mobilSaya.tampilkanInfo();
    }
}
