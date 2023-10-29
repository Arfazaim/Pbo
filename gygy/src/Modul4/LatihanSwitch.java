import java.util.Scanner;
public class LatihanSwitch {
    public static void main(String[] args) {
        
        int day;
            Scanner pilih = new Scanner(System.in);
            System.out.print("Masukan hari ke : ");
            day = pilih.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Senin");
                    break;
                case 2:
                    System.out.println("Selasa");
                    break;
                case 3:
                    System.out.println("Rabu");
                    break;
                case 4:
                    System.out.println("Kamis");
                    break;
                case 5:
                    System.out.println("Jum'at");
                    break;
                case 6:
                    System.out.println("Sabtu");
                    break;
                case 7:
                    System.out.println("Minggu");
                    break;
            }
            
    }
}