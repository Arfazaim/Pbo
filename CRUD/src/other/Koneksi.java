package other;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Koneksi {
    public Connection con;
    Statement stm;
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=
                    DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa",
                            "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal
                    "+e.getMessage());
        }
    }
}