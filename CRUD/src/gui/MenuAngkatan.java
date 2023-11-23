package gui;

import other.Koneksi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuAngkatan {
    private JPanel pnlAngkatan;
    private JTextField tid;
    private JTextField tangkatan;
    private JButton savabtn;
    private JButton updatebtn;
    private JButton deletebtn;
    private JButton cancelbtn;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuAngkatan");
        frame.setContentPane(new MenuAngkatan().pnlAngkatan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MenuAngkatan() {
        Koneksi DBA = new Koneksi();
        DBA.config();
        con = DBA.con;
        tabelangkatan();
        otomatis();
        savabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        updatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        deletebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void createLayout(){
        JFrame JFrame = new JFrame("MenuAngkatan");
        JFrame.setContentPane(pnlAngkatan);
        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
        JFrame.setVisible(true);
    }
    Connection con;
    private DefaultTableModel tabmode;
    protected void tabelangkatan(){
        Object[] barisangkatan = {"NO","TAHUN"};
        tabmode = new DefaultTableModel(null, barisangkatan);
        tblangkatan.setModel(tabmode);
        String sql = "select * from tb_angkatan";
        try {
            java.sql.Statement stat = con.createStatement();
            ResultSet dataangkatan = stat.executeQuery(sql);
            while (dataangkatan.next()){
                String a = dataangkatan.getString("id");
                String b =
                        dataangkatan.getString("tahun_angkatan");
                String [] data={a,b};
                tabmode.addRow(data);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Tampil" +e);
        }
    }
    protected void kosongprodi() {
        tangkatan.setText("");
    }
    protected void otomatis(){
        try{
            Statement stt =con.createStatement();
            String sql="select MAX(id) from tb_angkatan";
            ResultSet rs=stt.executeQuery(sql);
            while(rs.next()){
                int no=rs.getInt(1)+1;
                String cno=String.valueOf(no);
                tid.setText(cno);
            }
            rs.close();
            stt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
