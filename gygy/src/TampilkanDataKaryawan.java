import java.util.Scanner;

public class TampilkanDataKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Gaji: ");
        double gaji = input.nextDouble();

        input.nextLine();  // Clear the buffer
        System.out.print("Masukkan Devisi: ");
        String devisi = input.nextLine();

        System.out.println("\nData Karyawan:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
        System.out.println("Devisi: " + devisi);
    }
}
