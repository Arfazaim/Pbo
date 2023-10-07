import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) {
        String Nama;
        int Nim;
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        Nama = input.nextLine();
        System.out.println("Nomor Induk Mahasiswa");
        Nim = input.nextInt();
        System.out.println("_________________");
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + Nim);
    }
}
