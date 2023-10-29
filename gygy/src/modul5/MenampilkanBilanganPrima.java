package modul5;

import java.util.Scanner;
public class MenampilkanBilanganPrima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;

        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.println("PROGRAM STUDI S1 INFORMATIKA");
        System.out.println("FAKULTAS TEKNOLOGI SAINS DAN TEKNOLOGI");
        System.out.println("ITS PKU MUHAMMADIYAH SURAKARTA");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan Nilai Terkecil : ");
        awal=input.nextInt();
        System.out.print("Masukkan Nilai Terbesar : ");
        akhir=input.nextInt();
        System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}
