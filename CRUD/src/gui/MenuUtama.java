package gui;

import javax.swing.*;

public class MenuUtama {
    private JPanel PnlRoot;
    private JButton akunmahasiswabtn;
    private JButton prodibtn;
    private JButton angkatanbtn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuUtama");
        frame.setContentPane(new MenuUtama().PnlRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
