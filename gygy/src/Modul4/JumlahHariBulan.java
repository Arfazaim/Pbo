import java.util.Scanner;

public class JumlahHariBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka bulan (1-12): ");
        int month = scanner.nextInt();

        String[] monthNames = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month >= 1 && month <= 12) {
            System.out.println("Bulan: " + monthNames[month - 1]);
            System.out.println("Jumlah hari: " + daysInMonth[month - 1]);
        } else {
            System.out.println("Input bulan tidak valid.");
        }
    }
}
