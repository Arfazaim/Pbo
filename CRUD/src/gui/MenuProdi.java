package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuProdi {
    private JPanel pnlProdi;
    private JTextField tkode;
    private JTextField tprodi;
    private JButton savebtn;
    private JButton updatebtn;
    private JButton deletebtn;
    private JButton cancelbtn;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuProdi");
        frame.setContentPane(new MenuProdi().pnlProdi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MenuProdi() {
        savebtn.addActionListener(new ActionListener() {
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
        JFrame JFrame = new JFrame("MenuProdi");
        JFrame.setContentPane(pnlProdi);
        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
        JFrame.setVisible(true);
    }
    Connection con;
    private DefaultTableModel tabmode;
    protected void tabelprodi(){
        Object[] barisprodi = {"KODE PRODI","PRODI"};
        tabmode = new DefaultTableModel(null, barisprodi);
        tblprodi.setModel(tabmode);
        String sql = "select * from tb_prodi";
        try {
            java.sql.Statement stat = con.createStatement();
            ResultSet dataprodi = stat.executeQuery(sql);
            while (dataprodi.next()){
                String a = dataprodi.getString("kode_prodi");
                String b = dataprodi.getString("nama_prodi");
                String [] data={a,b};
                tabmode.addRow(data);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal
                    Tampil" +e);
        }
    }
    public void kodeotomatis(){
        try{
            String sql="select right(kode_prodi,2) as kd_prod
            from tb_prodi";
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery(sql);
            if(res.first()==false){
                tkode.setText("PROD-01");
            }else{
                res.last();
                int no=res.getInt(1)+1;
                String cno=String.valueOf(no);
                int pjg_cno=cno.length();
                for(int i=0;i<2-pjg_cno;i++){
                    cno= cno;
                }
                tkode.setText("PROD-0"+cno);
            }
        }catch(Exception e ){
            System.out.println(e);
        }
    }
    protected void kosongprodi() {
        tkode.setText("");
        tprodi.setText("");
    }
    public MenuProdi() {
        Koneksi DBA = new Koneksi();
        DBA.config();
        con = DBA.con;
        tabelprodi();
        kodeotomatis();
    }
}
