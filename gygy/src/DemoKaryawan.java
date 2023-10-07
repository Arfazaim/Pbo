public class DemoKaryawan {
    public static void main(String[] args) {
        Karyawan arzz = new Karyawan();
        Karyawan ari = new Karyawan();
        Karyawan adit = new Karyawan();

        arzz.nama = "Arfa zaim";
        arzz.jabatan = "Mahasiswa";

        ari.nama = "ari putra";
        ari.jabatan = "Mahasiswa";

        adit.nama = "adit adit";
        adit.jabatan = "mahasiswa";
        
        arzz.cetak();
        System.out.println(arzz.perusahaan);
        ari.cetak();
        System.out.println(ari.perusahaan);
        adit.cetak();
        System.out.println(adit.perusahaan);
    }
}