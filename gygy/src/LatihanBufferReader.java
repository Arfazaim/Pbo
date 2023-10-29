import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LatihanBufferReader {
    public static void main (String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String alamat;
        try
        {
            System.out.print("masukkan nama anda :");
            nama = br.readLine();
            System.out.print("masukkan alamat anda :");
            alamat = br.readLine();
            System.out.println("========================");
            System.out.println("nama anda :" + nama);
            System.out.println("alamat anda" + alamat);
        }
        catch(IOException eox)
        {
            System.out.println(eox);
        }
    }
}