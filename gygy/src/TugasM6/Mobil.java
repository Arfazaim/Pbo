package TugasM6;

public class Mobil {
    String merk;
    String warna;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Mobil " + merk + " berwarna " + warna + " dengan kecepatan " + kecepatan + " km/jam");
    }

    public void tambahKecepatan(int nilai) {
        kecepatan += nilai;
    }

    public void kurangiKecepatan(int nilai) {
        kecepatan -= nilai;
    }
}