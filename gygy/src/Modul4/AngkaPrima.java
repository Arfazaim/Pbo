import java.util.Scanner;
public class AngkaPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        boolean isAngkaPrima = cekAngkaPrima(angka);

        if (isAngkaPrima) {
            System.out.println(angka + " adalah angka prima.");
        } else {
            System.out.println(angka + " bukan angka prima.");
        }
    }

    public static boolean cekAngkaPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }
}