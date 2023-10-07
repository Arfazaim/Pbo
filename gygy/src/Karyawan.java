public class Karyawan {
    String nama;
    String jabatan;
    final String perusahaan = "ITS PKU Muhammadiyah Surakarta";

    void beriNama(String isiNama) {
        nama = isiNama;
    }

    void beriJabatan (String isiJabatan) {
        jabatan = isiJabatan;
    }

    void cetak() {
        System.out.println("Nama : " +nama+"\n"+
                "Jabatan : "+jabatan);
    }
}
