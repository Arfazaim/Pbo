import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonversiSuhu extends JFrame{
    private JPanel mainPanel;
    private JTextField txtcelcius;
    private JTextField txtfahrenheit;
    private JTextField txtreamur;
    private JTextField txtkelvin;
    private JButton convertButton;
    float celcius, fahrenheit, reamur, kelvin;

    public KonversiSuhu(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celcius = Float.parseFloat(txtcelcius.getText());
                fahrenheit = (float)((1.8*celcius)+32);
                reamur = (float)(0.8f * celcius);
                kelvin = (float)(celcius + 273.15f);

                txtfahrenheit.setText("" + fahrenheit);
                txtreamur.setText("" + reamur);
                txtkelvin.setText("" + kelvin);
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new KonversiSuhu(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
