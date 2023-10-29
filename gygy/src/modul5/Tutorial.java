package modul5;

import java.util.Scanner;
public class Tutorial {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        String[] matkulsem1={
            "Kewarganegaraan",
            "Algoritma dan Pemrograman",
            "Basis Data"
        };
        String[] matkulsem2={
            "Praktikum Algoritma dan Pemrograman",
            "Algoritma Pemrograman",
            "Basis Data"
        };
        String[] matkulsem3={
            "Sistem operasi",
            "Praktikum sistem operasi",
            "PBO"
        };
        System.out.println("Pilih Semester :");
        System.out.println("1. Semester I\n2. Semester II\n3. Semester III");
        System.out.print("Pilih : ");
        input=scanner.nextInt();
        switch(input){
            case 1:System.out.println("Daftar Mk SMT I :");show(matkulsem1); break;
            case 2:System.out.println("Daftar Mk SMT II :");show(matkulsem2); break;
            case 3:System.out.println("Daftar Mk SMT III :");show(matkulsem3); break;
            default: System.out.println("Pilihan tidak valid");
        }
    }

    public static void show(String[] matkul) {
        for(String eachMatkul : matkul){
            System.out.println("- " + eachMatkul);
        }
    }
}
